package cie;

import java.util.*;



public class Student{
	public String usn, name, sem;
	
	public void getdata(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Name");
		name = s.next();
		System.out.println("Enter USN");
		usn = s.next();
		System.out.println("Enter SEM");
		sem = s.next();
	}
}
