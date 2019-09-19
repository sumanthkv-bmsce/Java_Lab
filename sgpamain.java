import java.util.*;
	

class sgpa{
	int n;
	int marks[];
	int credits[];
	int grades[];
	float total_credits = 0;
	float total = 0;
	
	sgpa(int n){
		this.n = n;
		marks = new int [n];
		credits = new int [n];
		grades = new int [n];
		}

	void calcin(){
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < n; i++){
			System.out.println("Enter the subject marks: ");
			marks[i] = scan.nextInt();
			System.out.println("Enter subject credits: ");
			credits[i] = scan.nextInt();
			total_credits += credits[i];
			}
		}
		
		
	void calc(){
		for(int i = 0; i < n; i++){
			if(marks[i] >= 90){
				grades[i] = 10;
				total += grades[i] * credits[i];
				}
			else if(marks[i] >= 75){
				grades[i] = 9;
				total += grades[i] * credits[i];
				}
			else if(marks[i] >= 60){
				grades[i] = 8;
				total += grades[i] * credits[i];
				}
			else if(marks[i] >= 50){
				grades[i] = 7;
				total += grades[i] * credits[i];
				}
			else if(marks[i] >= 40){
				grades[i] = 6;
				total += grades[i] * credits[i];
				}
			else{
				grades[i] = 0;
				total += 0;
				}
			}
		}
		
	void display(){
		System.out.println("Sgpa is : " + total/total_credits);
		}
	}

class sgpamain{
	
	public static void main(String x[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of subjects: ");
		int n = scan.nextInt();

		sgpa s1 = new sgpa(n);
		s1.calcin();
		s1.calc();
		s1.display();
		}
	}
		
		

