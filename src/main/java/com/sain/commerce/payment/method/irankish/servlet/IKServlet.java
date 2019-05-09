/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 * <p>
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 * <p>
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.sain.commerce.payment.method.irankish.servlet;

import com.liferay.commerce.model.CommerceOrder;
import com.liferay.commerce.payment.engine.CommercePaymentEngine;
import com.liferay.commerce.service.CommerceOrderLocalService;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.module.configuration.ConfigurationException;
import com.liferay.portal.kernel.module.configuration.ConfigurationProvider;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.security.permission.PermissionCheckerFactoryUtil;
import com.liferay.portal.kernel.security.permission.PermissionThreadLocal;
import com.liferay.portal.kernel.servlet.PortalSessionThreadLocal;
import com.liferay.portal.kernel.settings.GroupServiceSettingsLocator;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Portal;

import com.sain.commerce.payment.method.irankish.configuration.IKGroupServiceConfiguration;
import com.sain.commerce.payment.method.irankish.constants.IKCommercePaymentMethodConstants;

import java.io.IOException;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sain.commerce.payment.method.irankish.ikc.verify.IVerify;
import com.sain.commerce.payment.method.irankish.ikc.verify.Verify;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Nader Jafari
 */
@Component(
        immediate = true,
        property = {
                "osgi.http.whiteboard.context.path=/" + IKCommercePaymentMethodConstants.SERVLET_PATH,
                "osgi.http.whiteboard.servlet.name=com.sain.commerce.payment.method.irankish.servlet.IKServlet",
                "osgi.http.whiteboard.servlet.pattern=/" + IKCommercePaymentMethodConstants.SERVLET_PATH + "/*"
        },
        service = Servlet.class
)
public class IKServlet extends HttpServlet {

    @Override
    protected void doGet(
            HttpServletRequest httpServletRequest,
            HttpServletResponse httpServletResponse)
            throws IOException, ServletException {

        try {
            HttpSession httpSession = httpServletRequest.getSession();

            if (PortalSessionThreadLocal.getHttpSession() == null) {
                PortalSessionThreadLocal.setHttpSession(httpSession);
            }

            User user = _portal.getUser(httpServletRequest);

            PermissionChecker permissionChecker =
                    PermissionCheckerFactoryUtil.create(user);

            PermissionThreadLocal.setPermissionChecker(permissionChecker);

            RequestDispatcher requestDispatcher =
                    _servletContext.getRequestDispatcher(
                            "/irankish_form/irankish-form.jsp");

            requestDispatcher.forward(httpServletRequest, httpServletResponse);
        } catch (Exception e) {
            _portal.sendError(e, httpServletRequest, httpServletResponse);
        }
    }

    @Override
    protected void doPost(
            HttpServletRequest httpServletRequest,
            HttpServletResponse httpServletResponse)
            throws IOException, ServletException {

        try {
            long groupId = ParamUtil.getLong(httpServletRequest, "groupId");
            String uuid = ParamUtil.getString(httpServletRequest, "uuid");
            String referenceId = ParamUtil.getString(
                    httpServletRequest, "referenceId");
            String resultCode = ParamUtil.getString(
                    httpServletRequest, "resultCode");
            String token = ParamUtil.getString(httpServletRequest, "token");
            String redirect = ParamUtil.getString(
                    httpServletRequest, "redirect");

            CommerceOrder commerceOrder =
                    _commerceOrderLocalService.getCommerceOrderByUuidAndGroupId(
                            uuid, groupId);

            IKGroupServiceConfiguration ikGroupServiceConfiguration =
                    _getConfiguration(commerceOrder.getGroupId());

            StringBuilder transactionReference = new StringBuilder();
            transactionReference.append(commerceOrder.getCompanyId());
            transactionReference.append(commerceOrder.getGroupId());
            transactionReference.append(commerceOrder.getCommerceOrderId());

            if (resultCode.equals("100")) {
//                verify payment
                Verify verify = new Verify();
                verify.getBasicHttpBindingIVerify();
                IVerify iVerify = verify.getBasicHttpBindingIVerify();
                Long aLong = iVerify.kicccPaymentsVerification(token, ikGroupServiceConfiguration.merchantId(),
                        referenceId, "");

                if (aLong.intValue() > 0) {
                    _commercePaymentEngine.completePayment(
                            commerceOrder.getCommerceOrderId(),
                            transactionReference.toString(), httpServletRequest);
                } else {
                    _commercePaymentEngine.cancelPayment(
                            commerceOrder.getCommerceOrderId(),
                            transactionReference.toString(), httpServletRequest);
                }
            } else {
                _commercePaymentEngine.cancelPayment(
                        commerceOrder.getCommerceOrderId(),
                        transactionReference.toString(), httpServletRequest);
            }
            httpServletResponse.sendRedirect(redirect);

        } catch (Exception e) {
            e.printStackTrace();
            _portal.sendError(e, httpServletRequest, httpServletResponse);
        }
    }

    private IKGroupServiceConfiguration _getConfiguration(long groupId)
            throws ConfigurationException {

        return _configurationProvider.getConfiguration(
                IKGroupServiceConfiguration.class,
                new GroupServiceSettingsLocator(
                        groupId, IKCommercePaymentMethodConstants.SERVICE_NAME));
    }

    @Reference
    private CommerceOrderLocalService _commerceOrderLocalService;

    @Reference
    private CommercePaymentEngine _commercePaymentEngine;

    @Reference
    private ConfigurationProvider _configurationProvider;

    @Reference
    private Portal _portal;

    @Reference(
            target = "(osgi.web.symbolicname=com.sain.commerce.payment.method.irankish)"
    )
    private ServletContext _servletContext;

}