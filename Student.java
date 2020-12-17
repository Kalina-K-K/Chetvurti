package edu4;

public class Student extends Person {
	private String classStatus;
	
	Student(String name, String adress, String phoneNumber, String eMail, String classStatus) {
		super(name, adress, phoneNumber, eMail);
		this.classStatus=classStatus;
	}
	
	public String toString() {
		return super.toString() + "\n" + classStatus;
	}
}
