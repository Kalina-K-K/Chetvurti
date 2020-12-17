package edu4;
import java.util.Date;
public class Employeee extends Person {
	private String office;
	private double salary;
	private Date dateHired;
	
	Employeee(String name, String adress, String phoneNumber, String eMail, String office, double salary, Date dateHired){
		super(name, adress, phoneNumber, eMail);
		this.office = office;
		this.salary=salary;
		this.dateHired = dateHired;
	}
	
	public String toString() {
		return super.toString() + "\n" + office + " " + salary + " " + dateHired;
	}
}
