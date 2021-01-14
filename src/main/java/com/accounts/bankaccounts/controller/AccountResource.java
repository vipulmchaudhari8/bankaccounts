package com.accounts.bankaccounts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.accounts.bankaccounts.dao.AccountDAO;
import com.accounts.bankaccounts.model.Accounts;
import com.accounts.bankaccounts.model.Transactions;
import com.accounts.bankaccounts.service.AccountsService;

@RestController
public class AccountResource {
	
	@Autowired
	private AccountsService accountService;

	@Autowired
	AccountDAO accountDAO;
	
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value= "/account", method=RequestMethod.GET)
	public List<Accounts> getAccountList(){		
		return accountService.getOfAccounts();
	}

	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value="/accountTransactions", method=RequestMethod.GET)
	public List<Transactions> getAccountTransactions(){		
		return accountService.getAccountTransactions();
	}
}
