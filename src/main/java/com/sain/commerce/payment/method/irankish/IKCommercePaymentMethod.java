/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.sain.commerce.payment.method.irankish;

import com.liferay.commerce.constants.CommerceOrderConstants;
import com.liferay.commerce.constants.CommerceOrderPaymentConstants;
import com.liferay.commerce.constants.CommercePaymentConstants;
import com.liferay.commerce.currency.model.CommerceCurrency;
import com.liferay.commerce.model.CommerceOrder;
import com.liferay.commerce.payment.method.CommercePaymentMethod;
import com.liferay.commerce.payment.request.CommercePaymentRequest;
import com.liferay.commerce.payment.result.CommercePaymentResult;
import com.liferay.commerce.service.CommerceOrderService;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.module.configuration.ConfigurationException;
import com.liferay.portal.kernel.module.configuration.ConfigurationProvider;
import com.liferay.portal.kernel.settings.GroupServiceSettingsLocator;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.ResourceBundleUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.sain.commerce.payment.method.irankish.configuration.IKGroupServiceConfiguration;
import com.sain.commerce.payment.method.irankish.constants.IKCommercePaymentMethodConstants;
import com.sain.commerce.payment.method.irankish.ikc.ITokens;
import com.sain.commerce.payment.method.irankish.ikc.Service1;
import com.sain.commerce.payment.method.irankish.ikc.TokenResponse;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URL;
import java.util.*;

/**
 * @author Nader Jafari
 */
@Component(
	immediate = true,
	property = "commerce.payment.engine.method.key=" + IKCommercePaymentMethod.KEY,
	service = CommercePaymentMethod.class
)
public class IKCommercePaymentMethod implements CommercePaymentMethod {

	public static final String KEY = "irankish";

	@Override
	public CommercePaymentResult cancelPayment(
			CommercePaymentRequest commercePaymentRequest) {
		IKCommercePaymentRequest ikCommercePaymentRequest =
				(IKCommercePaymentRequest) commercePaymentRequest;

		return new CommercePaymentResult(
				ikCommercePaymentRequest.getTransactionId(), ikCommercePaymentRequest.getCommerceOrderId(),
				CommerceOrderPaymentConstants.STATUS_CANCELLED, false, null,
				null, Collections.emptyList(), true);
	}

	@Override
	public CommercePaymentResult completePayment(
			CommercePaymentRequest commercePaymentRequest)
			throws Exception {

		IKCommercePaymentRequest ikCommercePaymentRequest =
				(IKCommercePaymentRequest) commercePaymentRequest;

		return new CommercePaymentResult(
				ikCommercePaymentRequest.getTransactionId(), ikCommercePaymentRequest.getCommerceOrderId(),
				CommerceOrderConstants.PAYMENT_STATUS_PAID, false, null, null,
				Collections.emptyList(), true);
	}

	@Override
	public String getDescription(Locale locale) {
		ResourceBundle resourceBundle = _getResourceBundle(locale);

		return LanguageUtil.get(resourceBundle, "irankish-description");
	}

	@Override
	public String getKey() {
		return KEY;
	}

	@Override
	public String getName(Locale locale) {
		ResourceBundle resourceBundle = _getResourceBundle(locale);

		return LanguageUtil.get(resourceBundle, KEY);
	}

	@Override
	public int getPaymentType() {
		return CommercePaymentConstants.
			COMMERCE_PAYMENT_METHOD_TYPE_ONLINE_REDIRECT;
	}

	@Override
	public String getServletPath() {
		return IKCommercePaymentMethodConstants.SERVLET_PATH;
	}

	@Override
	public boolean isCancelEnabled() {
		return true;
	}

	@Override
	public boolean isCompleteEnabled() {
		return true;
	}

	@Override
	public boolean isProcessPaymentEnabled() {
		return true;
	}

	@Override
	public CommercePaymentResult processPayment(
			CommercePaymentRequest commercePaymentRequest)
		throws Exception {

		IKCommercePaymentRequest IKCommercePaymentRequest =
			(IKCommercePaymentRequest)commercePaymentRequest;

		CommerceOrder commerceOrder = _commerceOrderService.getCommerceOrder(
			IKCommercePaymentRequest.getCommerceOrderId());

		IKGroupServiceConfiguration  ikGroupServiceConfiguration =
				_getConfiguration(commerceOrder.getGroupId());

		CommerceCurrency commerceCurrency = commerceOrder.getCommerceCurrency();

		BigDecimal amount = commerceOrder.getTotal();
		String roundingMode = commerceCurrency.getRoundingMode();
		BigDecimal total = amount.setScale(
				commerceCurrency.getMaxFractionDigits(),
				RoundingMode.valueOf(roundingMode));

		StringBuilder transactionReference = new StringBuilder();

		transactionReference.append(commerceOrder.getCompanyId());
		transactionReference.append(commerceOrder.getGroupId());
		transactionReference.append(commerceOrder.getCommerceOrderId());

		URL returnUrl = new URL(IKCommercePaymentRequest.getReturnUrl());

		Map<String, String> parameters = _getQueryMap(returnUrl.getQuery());

		URL baseUrl = new URL(
				returnUrl.getProtocol(), returnUrl.getHost(), returnUrl.getPort(),
				returnUrl.getPath());

		StringBuilder normalUrl = new StringBuilder(baseUrl.toString());

		normalUrl.append(StringPool.QUESTION);
		normalUrl.append("type=normal");
		normalUrl.append(StringPool.AMPERSAND);
		normalUrl.append("redirect=");
		normalUrl.append(parameters.get("redirect"));

		StringBuilder automaticUrl = new StringBuilder(baseUrl.toString());

		automaticUrl.append(StringPool.QUESTION);
		automaticUrl.append("type=automatic");
		automaticUrl.append(StringPool.AMPERSAND);
		automaticUrl.append("groupId=");
		automaticUrl.append(parameters.get("groupId"));
		automaticUrl.append(StringPool.AMPERSAND);
		automaticUrl.append("uuid=");
		automaticUrl.append(parameters.get("uuid"));
		automaticUrl.append(StringPool.AMPERSAND);
		automaticUrl.append("redirect=");
		automaticUrl.append(parameters.get("redirect"));

//		Get token
		Service1 service1 = new Service1();
		ITokens iTokens = service1.getBasicHttpBindingITokens();
		TokenResponse tokenResponse = iTokens.makeToken(String.valueOf(total.intValue()),
				ikGroupServiceConfiguration.merchantId(), String.valueOf(IKCommercePaymentRequest.getCommerceOrderId()),
				String.valueOf(IKCommercePaymentRequest.getCommerceOrderId()),
				"", automaticUrl.toString(), "");

//		Build irankish payment URL
		String url = StringBundler.concat(
				_getServletUrl(IKCommercePaymentRequest), StringPool.QUESTION,
				"redirectUrl=",
				"https://ikc.shaparak.ir/tpayment/payment/Index",
				StringPool.AMPERSAND, "token=",
				tokenResponse.getToken().getValue(), StringPool.AMPERSAND,
				"merchantId=",ikGroupServiceConfiguration.merchantId());

		return new CommercePaymentResult(
				transactionReference.toString(),
				commerceOrder.getCommerceOrderId(),
				CommerceOrderConstants.PAYMENT_STATUS_AUTHORIZED, true, url,
				null, Collections.emptyList(), true);
	}

	private Map<String, String> _getQueryMap(String query)
	{

		String[] params = query.split(StringPool.AMPERSAND);


		Map<String, String> map = new HashMap();

		for (String param : params)
		{
			String name = param.split(StringPool.EQUAL)[0];
			String value = param.split(StringPool.EQUAL)[1];

			map.put(name, value);
		}

		return map;
	}

	private ResourceBundle _getResourceBundle(Locale locale) {
		return ResourceBundleUtil.getBundle(
			"content.Language", locale, getClass());
	}

	private String _getServletUrl(
		IKCommercePaymentRequest IKCommercePaymentRequest) {

		return StringBundler.concat(
			_portal.getPortalURL(
				IKCommercePaymentRequest.getHttpServletRequest()),
			_portal.getPathModule(), StringPool.SLASH,
			IKCommercePaymentMethodConstants.SERVLET_PATH);
	}

	private IKGroupServiceConfiguration _getConfiguration(long groupId)
			throws ConfigurationException {

		return _configurationProvider.getConfiguration(
				IKGroupServiceConfiguration.class,
				new GroupServiceSettingsLocator(
						groupId, IKCommercePaymentMethodConstants.SERVICE_NAME));
	}

	@Reference
	private CommerceOrderService _commerceOrderService;

	@Reference
	private ConfigurationProvider _configurationProvider;

	@Reference
	private Portal _portal;

}