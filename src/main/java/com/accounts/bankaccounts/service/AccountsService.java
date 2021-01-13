package com.accounts.bankaccounts.service;

import java.util.List;

import com.accounts.bankaccounts.model.Accounts;
import com.accounts.bankaccounts.model.Transactions;

public interface AccountsService {
	List<Accounts> getOfAccounts();
	List<Transactions> getAccountTransactions();	
}
