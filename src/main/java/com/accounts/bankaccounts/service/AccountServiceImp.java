package com.accounts.bankaccounts.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accounts.bankaccounts.dao.AccountDAO;
import com.accounts.bankaccounts.dao.TransactionsDAO;
import com.accounts.bankaccounts.model.Accounts;
import com.accounts.bankaccounts.model.Transactions;

@Service
public class AccountServiceImp implements AccountsService {

	@Autowired
	AccountDAO accountDAO;

	@Autowired
	TransactionsDAO transactionsDAO;
	
	@Override
	public List<Accounts> getOfAccounts() {
		
		List<Accounts> listAccounts = new ArrayList<Accounts>();
		
		listAccounts = (List<Accounts>) accountDAO.findAll();
		
		return listAccounts;
	}


	@Override
	public List<Transactions> getAccountTransactions() {
		
		List<Transactions> listTransactions = new ArrayList<Transactions>();
		
		listTransactions = (List<Transactions>) transactionsDAO.findAll();

		return listTransactions;
	}
}
