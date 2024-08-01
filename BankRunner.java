package com.google.bankapplication;

import com.google.banking.Bank;

public class BankRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank bank=new Bank();
		bank.setName("sbi");
		System.out.println("bank name:" +bank.getName());
		
		bank.setholderName("sarika");
		System.out.println("holder name:" +bank.getholderName());
		
		
		bank.setNumber(1234567854);
		System.out.println("display acc num:"+bank.getNumber());
		if(bank.getNumber()==bank.getNumber()){
			   System.out.println("display acc num:"+bank.getNumber());
			   System.out.println("display acc num:"+bank.getName());
	      }else {
	    	  System.out.println("not match");
	      }
		
		
		bank.setadharNum(562816);	
		if(bank.getadharNum()==10) {
			
			System.out.println("number is equal");
		  }else {
			  System.out.println("not equal");
		  }
		    System.out.println("adharnum:" +bank.getadharNum());
		

		bank.setbalance(200000);
		if(bank.getbalance()<500){
			System.out.println("please maintain bank balance");
		}
		
		bank.setbalance(2000);
		if(bank.getbalance()>500&&bank.getbalance()<10000){
			double interest=bank.getbalance()*0.10;
			double totalbalance=bank.getbalance()+interest;
		    System.out.println("bank balance:" +totalbalance);
		}else {
		    System.out.println("bank balance:" +bank.getbalance());
		}
		
		
		bank.setbalance(10000);
		if(bank.getbalance()>500&& bank.getbalance()<50000){
			double interest=bank.getbalance()*0.20;
			double totalbalance=bank.getadharNum()+interest;
			System.out.println("total balance:"+totalbalance);
		}
		
		
		
		bank.setbalance(1000);
		if(bank.getbalance()<2000) {
			System.out.println("Account balance is low,cant withdraw amount");
		}else {
			System.out.println("balance:" +bank.getbalance());
		}
			
		
			
		
		
		
		
		
	}
	
	
	}

