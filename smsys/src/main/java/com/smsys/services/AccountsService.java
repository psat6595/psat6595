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
package com.smsys.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smsys.accounts.AccountInfo;
import com.smsys.repositories.AccountRepoHelper;

@Service
public class AccountsService {

	@Autowired
	private AccountRepoHelper accountRepo;
	
	public String createAccount(final AccountInfo accountInfo){
		return accountRepo.createAdminAccount(accountInfo);
	}
}
