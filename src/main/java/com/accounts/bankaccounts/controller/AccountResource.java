package com.accounts.bankaccounts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accounts.bankaccounts.model.Accounts;
import com.accounts.bankaccounts.model.Transactions;
import com.accounts.bankaccounts.service.AccountsService;

@RestController
public class AccountResource {
	
	@Autowired
	private AccountsService accountService;

	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping("/account")
	public List<Accounts> getAccountList(){		
		return accountService.getOfAccounts();
	}

	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping("/accountTransactions")
	public List<Transactions> getAccountTransactions(){		
		return accountService.getAccountTransactions();
	}
}
