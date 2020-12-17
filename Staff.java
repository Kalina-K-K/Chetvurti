package edu4;

import java.util.Date;

public class Staff extends Employeee {
	private String title;
	
	Staff(String name, String adress, String phoneNumber, String eMail, String office, double salary, Date dateHired, String title){
		super(name, adress, phoneNumber, eMail, office, salary, dateHired);
		this.title = title;
	}
	
	public String toString() {
		return super.toString() + "\n" + title;
	}
}
