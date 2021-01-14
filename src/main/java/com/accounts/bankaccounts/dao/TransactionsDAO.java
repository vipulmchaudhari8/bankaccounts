package com.accounts.bankaccounts.dao;

import org.springframework.data.repository.CrudRepository;

import com.accounts.bankaccounts.model.Transactions;

public interface TransactionsDAO  extends CrudRepository<Transactions, Integer> {

}
 