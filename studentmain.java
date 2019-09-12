/*write a program to create a class person, let the members be: Name and Address of the person.
Create a class Student which extends person, the members are: MArks of 3 subjects, m1, m2, m3 and class
Test these 2 classes by calculating average marks of a given student. Output: Name , Address, marks and average 
Use super to pass values to the parent class.*/
class person{
	String name, address;
	int age;
	person(String name, String address, int age){
		this.name = name;
		this.address = address;
		this.age = age;
}
class student extends person{
	int rollno, sem;
	
	student(int rollno, int sem, String name, String address, int age){
		this.rollno = rollno;
		this.sem = sem;
		super(name, address, age);
	}
}
class exam extends student{
	double avg = 0, marks1, marks2;
	
	exam(double a, double b, int rollno, int sem, String name, String address, int age){
		this.marks1 = a;
		this.marks2 = b;
		super(rollno, sem, name, age, address, age);
	}
	void average{
		avg = (a + b)/2
	}
	
	
	
	void display(){
		System.out.println("Average: " + avg);
	}
}

class studentmain{
	public static void main(String arg[]){
		
		
		
		
		
		
		
	
		
	
	
	  
