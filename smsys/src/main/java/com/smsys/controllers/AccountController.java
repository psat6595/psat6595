/*
 * ArNel: Copyright (c) 2015 ArNel Corporation. All rights reserved. THIS
 * SOFTWARE CONTAINS CONFIDENTIAL INFORMATION AND TRADE SECRETS OF ArNel
 * Tech. USE, DISCLOSURE OR REPRODUCTION IS PROHIBITED WITHOUT THE PRIOR
 * EXPRESS WRITTEN PERMISSION OF ArNel Tech. The Licensed Software and
 * Documentation are deemed to be commercial computer software as defined in FAR
 * 12.212 and subject to restricted rights as defined in FAR Section 52.227-19
 * "Commercial Computer Software - Restricted Rights" and DFARS 227.7202,
 * "Rights in Commercial Computer Software or Commercial Computer Software
 * Documentation", as applicable, and any successor regulations. Any use,
 * modification, reproduction release, performance, display or disclosure of the
 * Licensed Software and Documentation by the Government shall be solely in
 * accordance with the terms of this Agreement.
 */
package com.smsys.controllers;

import java.io.IOException;
import java.net.URISyntaxException;

import javax.servlet.http.HttpServletRequest;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.apache.log4j.Logger;
import com.smsys.accounts.AccountInfo;
import com.smsys.services.AccountsService;

/**
 * This controller defined the REST calls for account related information like
 * createAccount for User or Admin.
 *
 */
@Controller
@RequestMapping(value = { "/accounts" })
public class AccountController {

	private static final Logger logger = Logger
			.getLogger(AccountController.class);
	@Autowired
	private AccountsService accountsService;

	/**
	 * Create an account on the basis of passed account type. It can be User or
	 * Admin account.
	 *
	 * @param accountJson
	 *            the HTTP request body should contain the account information
	 *            in json format.
	 * @param request
	 *            specifies the HttpServletRequest.
	 * @return HttpStatus.CREATED if successful. Also sets the Location header
	 *         containing the id of the resource created.
	 * @throws IOException
	 *             if there are format conversion issues.
	 * @throws URISyntaxException
	 *             if an invalid URI is created to set in the response headers.
	 */
	@RequestMapping(method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.TEXT_PLAIN_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public ResponseEntity<AccountInfo> createAccount(
			@RequestBody final String accountJson,
			final HttpServletRequest request) {
		// logs debug message
		if (logger.isDebugEnabled()) {
			logger.debug("Create Account call: Begin");
		}
		if (StringUtils.isEmpty(accountJson)) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

		try {
			final AccountInfo accountInfo = new ObjectMapper().readValue(
					accountJson, AccountInfo.class);
			return new ResponseEntity<>(
					accountsService.createAccount(accountInfo),
					HttpStatus.CREATED);
		} catch (final IOException exc) {
			logger.error("Error occured while creating the account:", exc);
			throw new IllegalArgumentException(
					"Error occured while creating the account:");
		}
	}
}
