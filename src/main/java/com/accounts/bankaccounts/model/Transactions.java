package com.accounts.bankaccounts.model;

public class Transactions {
	
	private int accountNumber;
	private String accountType;
	private String valueDate;
	private String currency;
	private double debitedAmount;
	private double creditedAmount;
	private String creditDebitType;
	private String transactionNarrative;
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getValueDate() {
		return valueDate;
	}
	public void setValueDate(String valueDate) {
		this.valueDate = valueDate;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public double getDebitedAmount() {
		return debitedAmount;
	}
	public void setDebitedAmount(double debitedAmount) {
		this.debitedAmount = debitedAmount;
	}
	public double getCreditedAmount() {
		return creditedAmount;
	}
	public void setCreditedAmount(double creditedAmount) {
		this.creditedAmount = creditedAmount;
	}
	public String getCreditDebitType() {
		return creditDebitType;
	}
	public void setCreditDebitType(String creditDebitType) {
		this.creditDebitType = creditDebitType;
	}
	public String getTransactionNarrative() {
		return transactionNarrative;
	}
	public void setTransactionNarrative(String transactionNarrative) {
		this.transactionNarrative = transactionNarrative;
	}
}
