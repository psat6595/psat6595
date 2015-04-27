package com.smsys.repositories;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.smsys.accounts.AccountInfo;

@Component
public class AccountRepoHelper {

	@Autowired
	private AccountRepository accountRepo;
	
	public AccountInfo createAdminAccount(final AccountInfo accountInfo){
		accountInfo.setAccountId(String.valueOf(Math.random()));
		accountInfo.setId(UUID.randomUUID().toString());
		final AccountInfo accountInfoResp = accountRepo.save(accountInfo);
		return accountInfoResp;
	}
}
