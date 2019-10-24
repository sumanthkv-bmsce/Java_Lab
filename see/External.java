package see;

import java.util.*;
import cie.Internal;



public class External extends Internal{
	public double see_marks[] = new double[5];
	public void getseeMarks(){
		Scanner s = new Scanner(System.in);
		for(int i = 0;i<5;i++){
			System.out.println("Enter Element " + i);
			see_marks[i] = s.nextDouble();
		}
	}
	
	public void put(){
		for(int j = 0;j<5;j++){
			System.out.println("Final marks for subject " + j);
			System.out.println(see_marks[j] + cie_marks[j]);
		}
	}	
}
