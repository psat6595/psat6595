package com.smsys.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.smsys.accounts.AccountInfo;

@Component
public class AccountRepoHelper {

	@Autowired
	private AccountRepository accountRepo;
	
	public String createAdminAccount(final AccountInfo accountInfo){
		accountInfo.setAdminAccountId(String.valueOf(Math.random()));
		final AccountInfo accountInfoResp = accountRepo.save(accountInfo);
		return accountInfoResp.getAdminAccountId();
	}
}
