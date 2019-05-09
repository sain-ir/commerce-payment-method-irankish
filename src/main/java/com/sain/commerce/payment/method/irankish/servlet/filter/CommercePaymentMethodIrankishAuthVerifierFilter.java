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

package com.sain.commerce.payment.method.irankish.servlet.filter;

import com.liferay.portal.servlet.filters.authverifier.AuthVerifierFilter;

import com.sain.commerce.payment.method.irankish.constants.IKCommercePaymentMethodConstants;

import javax.servlet.Filter;

import org.osgi.service.component.annotations.Component;

/**
 * @author Nader Jafari
 */
@Component(
	immediate = true,
	property = {
		"filter.init.auth.verifier.PortalSessionAuthVerifier.urls.includes=/" + IKCommercePaymentMethodConstants.SERVLET_PATH + "/*",
		"osgi.http.whiteboard.filter.name=com.sain.commerce.payment.method.irankish.servlet.filter.CommercePaymentMethodIrankishAuthVerifierFilter",
		"osgi.http.whiteboard.servlet.pattern=/" + IKCommercePaymentMethodConstants.SERVLET_PATH + "/*"
	},
	service = Filter.class
)
public class CommercePaymentMethodIrankishAuthVerifierFilter
	extends AuthVerifierFilter {
}