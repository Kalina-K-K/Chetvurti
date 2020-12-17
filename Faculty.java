package edu4;

import java.util.Date;

public class Faculty extends Employeee {
	private String rank;
	private int officeHours;
	
	Faculty(String name, String adress, String phoneNumber, String eMail, String office, double salary, Date dateHired, String rank, int officeHours){
		super(name, adress, phoneNumber, eMail, office, salary, dateHired);
		this.rank=rank;
		this.officeHours=officeHours;
	}
	
	public String toString() {
		return super.toString() + "\n" + rank + " " + officeHours;
	}
}
