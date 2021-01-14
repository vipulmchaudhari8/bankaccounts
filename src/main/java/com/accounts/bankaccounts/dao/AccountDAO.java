package com.accounts.bankaccounts.dao;

import org.springframework.data.repository.CrudRepository;

import com.accounts.bankaccounts.model.Accounts;

public interface AccountDAO  extends CrudRepository<Accounts, Integer> {

}
 