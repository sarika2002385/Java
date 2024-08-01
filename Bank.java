package com.google.banking;

public class Bank {
	
	private int accountno;
	private String acc_holdername;
	private String bankname;
	private int adharno;
	private int balance;
	
	public void setNumber(int accountno) {
		this.accountno=accountno;
	}
	
	public int getNumber() {
		return this.accountno;
	}

	
	public void setadharNum(int adharno) {
		this.adharno=adharno;
	}
	
	public int getadharNum() {
		return this.adharno;
	}
	
	public void setbalance(int balance) {
		this.balance=balance;
	}
	
	public int getbalance() {
		return this.balance;
	}
	
	public void setName(String bankname) {
		this.bankname=bankname;
	}
	
	public String getName() {
		return this.bankname;

}
	public void setholderName(String acc_holdername) {
		this.acc_holdername=acc_holdername;
	}
	
	public String getholderName() {
		return this.acc_holdername;
	}
	
	
	
	
	
	
	
}