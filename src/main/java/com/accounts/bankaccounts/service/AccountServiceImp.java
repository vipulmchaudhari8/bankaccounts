package com.accounts.bankaccounts.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.accounts.bankaccounts.model.Accounts;
import com.accounts.bankaccounts.model.Transactions;

@Service
public class AccountServiceImp implements AccountsService {

	@Override
	public List<Accounts> getOfAccounts() {
		
		List<Accounts> listAccounts = new ArrayList<Accounts>();
		
		Accounts account1 = new Accounts();
		account1.setAccountNumber(10000);
		account1.setAccountName("SGSavings726");
		account1.setAccountType("Savings");
		account1.setBalanceDate("12/11/2020");
		account1.setCurrency("AUD");
		account1.setBalance(84934);
		
		Accounts account2 = new Accounts();
		account2.setAccountNumber(20000);
		account2.setAccountName("AUCurrent933");
		account2.setAccountType("Current");
		account2.setBalanceDate("02/06/2020");
		account2.setCurrency("USD");
		account2.setBalance(50773);
		
		Accounts account3 = new Accounts();
		account3.setAccountNumber(30000);
		account3.setAccountName("SGSaving655");
		account3.setAccountType("Saving");
		account3.setBalanceDate("02/12/2020");
		account3.setCurrency("SGD");
		account3.setBalance(65432);		
		
		listAccounts.add(account1);
		listAccounts.add(account2);
		listAccounts.add(account3);
		
		return listAccounts;
	}


	@Override
	public List<Transactions> getAccountTransactions() {
		
		List<Transactions> listTransactions = new ArrayList<Transactions>();
		
		Transactions transactions1 = new Transactions();
		transactions1.setAccountNumber(10000);
		transactions1.setAccountType("Savings");
		transactions1.setValueDate("Dec,19,2020");
		transactions1.setCurrency("AUD");
		transactions1.setDebitedAmount(0);
		transactions1.setCreditedAmount(1232);
		transactions1.setCreditDebitType("SGSavings726");
		transactions1.setTransactionNarrative("");
		
		Transactions transactions2 = new Transactions();
		transactions2.setAccountNumber(10000);
		transactions2.setAccountType("Savings");
		transactions2.setValueDate("Dec,15,2020");
		transactions2.setCurrency("AUD");
		transactions2.setDebitedAmount(0);
		transactions2.setCreditedAmount(500);
		transactions2.setCreditDebitType("SGSavings726");
		transactions2.setTransactionNarrative("");		
		
		Transactions transactions3 = new Transactions();
		transactions3.setAccountNumber(10000);
		transactions3.setAccountType("Savings");
		transactions3.setValueDate("Dec,10,2020");
		transactions3.setCurrency("AUD");
		transactions3.setDebitedAmount(0);
		transactions3.setCreditedAmount(600);
		transactions3.setCreditDebitType("SGSavings726");
		transactions3.setTransactionNarrative("");		
				
		listTransactions.add(transactions1);
		listTransactions.add(transactions2);
		listTransactions.add(transactions3);
		
		return listTransactions;
	}
}
