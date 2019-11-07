import java.util.*;

class WrongAge extends Exception{
	private int detail;
	
	Wrongage(int a){
		detail = a;
	}
	
	public String toString(){
		return "WrongAge[" + f_age + "]";
	}
}

class Father{
	int f_age;
	
	Father(int x){
		f_age = x;
	}
}

class Son extends Father{
	int s_age;
	
	Son(int x, int y){
		super(a);
		s_age = y;
		
		if(father_age<=0)
	}
	
	public String toString(){
		return "Father age is " + f_age + "Son age is " + s_age;
	}
}

class expmain{
	static void f_compute(int a) throws Father{
		System.out.println("Called father compute(" + a + ")");
		if(a < 0)
			throw new Father(a);
		System.out.println("Normal exit");
	}
	
	static void s_compute(int a, int b) throws Son{
		System.out.println("Called son compute(" + a + ", " + b + ")");
		if(a >= b)
			throw new Son(a, b);
		System.out.println("Normal exit");
	}
	
	public static void main(String arg[]){
		try{
			f_compute(-1);
			f_compute(100);
		} catch (Father f){
			System.out.println("Caught " + f);
		}
		
		try{
			s_compute(2, 23);
			s_compute(51, 21);
		} catch (Son s){
			System.out.println("Caught " + s);
		}
	}
}
			
		
