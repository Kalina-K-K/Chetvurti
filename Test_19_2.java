package edu4;

public class Test_19_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account19 acc = new Account19(123,300);
		System.out.println(acc.toString());
		SavingsAccount sacc = new SavingsAccount(456,400);
		CheckingAccount chacc = new CheckingAccount(789, 120,500) ;
		
		sacc.withdraw(230);
		System.out.println(sacc.toString());
		sacc.withdraw(200);
		System.out.println(sacc.toString());
		chacc.withdraw(160);
		System.out.println(chacc.toString());
	}

}
