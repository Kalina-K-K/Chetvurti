package edu4;

public class SavingsAccount extends Account19{
	
	SavingsAccount(int id, double balance){
		super(id, balance);
	}
	public void withdraw(double sum) {
		if(balance<sum) {
			System.out.println("Error");
		}else {
			balance = balance-sum;
		}
	}
	public String toString() {
		return super.toString() + " Savings account";
	}
}
