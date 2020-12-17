package edu4;

public class Person {
	private String name;
	private String adress;
	private String phoneNumber;
	private String eMail;
	
	Person(String name, String adress, String phoneNumber, String eMail){
		this.name=name;
		this.adress=adress;
		this.phoneNumber=phoneNumber;
		this.eMail=eMail;
	}
	
	public String toString() {
		return name + " " + adress + " " + phoneNumber + " " + eMail;
	}
	
}
