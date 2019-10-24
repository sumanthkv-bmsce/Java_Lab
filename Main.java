import java.util.*;
import cie.*;
import see.*;

class Main{
	public static void main(String arg[]){
	
		External list[] = new External[2];
		
		for(int i=0;i<2;i++){
			System.out.println("Enter data for Student " + i);
			list[i] = new External();
			
			list[i].getdata();
			list[i].getcieMarks();
			list[i].getseeMarks();
			list[i].put();
		}
	}
}
