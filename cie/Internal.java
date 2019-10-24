package cie;

import java.util.*;
import cie.Student;



public class Internal extends Student{
	public double cie_marks[] = new double[5];
	
	public void getcieMarks(){
		Scanner s = new Scanner(System.in);
		for(int i = 0;i<5;i++){
			System.out.println("Enter Element " + i);
			cie_marks[i] = s.nextDouble();
		}
	}
}
			

