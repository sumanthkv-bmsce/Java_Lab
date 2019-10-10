import java.util.*;

abstract class account{
	String name, acc;
	double balance;
	
	void display(){
		System.out.println(balance);
		}
		
	void deposit(double amt){
		balance += amt;
		}
		
	void widraw(double amt){
		if((balance - amt) <= 0)
			System.out.println("Not enough balance!!!!");
		else
			balance -= amt;
		}
	abstract void compute();
	}

class sav extends account{

	sav(double amt){
		balance = amt;
		}
	
	void compute(){
		balance *= 1.05;
		}
	}
		
	
class curr extends account{

	curr(double amt){
		balance = amt;
		}

	void compute(){
		if(balance < 100)
			balance -= 0.01*balance;
		}
	}
	
class bank{
	public static void main(String arg[]){
		int y = 0;
		double amt = 0, ini_amt = 0;
		account a;
		Scanner s = new Scanner(System.in);
		System.out.println("Do you want to create a 1: Savings or 2: Current account.....");
		int x = s.nextInt();
		System.out.println("Enter initial amount in bank...");
		ini_amt = s.nextDouble();
		if(x == 1){
			a = new sav(ini_amt);
			}
		
		else{
			a = new curr(ini_amt);
			}
		System.out.println("Name...");
		a.name = s.next();
		System.out.println("Account No.......");
		a.acc = s.next();
		while(y != 4){
			a.compute();
			System.out.println("Your Balance: ");
			a.display();
			System.out.println("Enter 1: Deposit, 2: Widraw, 3: Display, 4: Exit");
			y = s.nextInt();
			switch(y){
				case 1:
					System.out.println("Enter amount to deposit: ");
					amt = s.nextDouble();
					a.deposit(amt);
					break;
				case 2:
					System.out.println("Enter amount to withdraw: ");
					amt = s.nextDouble();
					a.widraw(amt);
					break;
				case 3:
					System.out.println("Your Balance: ");
					a.display();
					break;
				}
			}
		}
	}
			
					
					
	

