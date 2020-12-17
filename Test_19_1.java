package edu4;

import java.util.Date;

public class Test_19_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("Kalina", "Lyulin", "0888888888", "k@gmail.com");
		Student s = new Student("Kalina", "Lyulin", "0888888888", "k@gmail.com","fresh-man");
		Employeee e = new Employeee("Velina", "Lyulin", "0888888888", "v@gmail.com","office 1", 600, new Date(2015, 0, 23));
		Faculty f = new Faculty("Ralitsa", "Lyulin", "0888888888", "r@gmail.com","office 2", 666, new Date(2014, 11, 8),"nz",8);
		Staff st = new Staff("Kalina", "Lyulin", "0123456789", "k@gmail.com","office 3", 1234, new Date(2010, 0, 23),"pak nz");
		System.out.println(p.toString());
//		System.out.println();
		System.out.println(s.toString());
//		System.out.println();
		System.out.println(f.toString());
//		System.out.println();
		System.out.println(st.toString());
		System.out.println(e.toString());
	}

}
