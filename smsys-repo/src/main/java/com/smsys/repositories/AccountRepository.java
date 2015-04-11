package com.smsys.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import com.smsys.accounts.AccountInfo;

@Repository
public interface AccountRepository extends CrudRepository<AccountInfo, String>{}
