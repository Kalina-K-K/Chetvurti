package edu4;

import java.util.Date;

public class Account19 {
	private int id=0;
	protected double balance=0;
	private static double yearInterestRate=0;
	private Date dateCreated = new Date();
	
	Account19(){
	}
	
	Account19(int id, double balance){
		this.id=id;
		this.balance=balance;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public static void setYearInterestRate(double yir) {
		yearInterestRate=yir;
	}
	public int getId() {
		return id;
	}
	public double getBalance() {
		return balance;
	}
	public double getYIR() {
		return yearInterestRate;
	}
	public String getDate() {
		return dateCreated.toString();
	}
	
	public static double getMonthlyInterestRate() {
		return yearInterestRate/12;
	}
	public double getMonthlyInterest() {
		return balance*yearInterestRate/(12*100);
	}
	public void withdraw(double sum) {
			balance = balance-sum;
	}
	public void deposit(double sum) {
		balance=balance+sum;
	}
	
	public String toString() {
		return id + " " + balance + " " + dateCreated;
	}
}
