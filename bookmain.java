/*1 class book - 4 members: name, author, price and number of pages
INclude a constructor to set the value for the members, 
Include method to set and get the details of the object
Include a toString method that could display the complete details of the book
Develop a java program to create n book objects*/

import java.util.*;
class book{
	String name;
	String author;
	double price;
	int pages;
	
	book(){
		name = "";
		author = "";
		price = 0.0;
		pages = 0;
		}
	void get_val(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Name: ");
		name = scan.next();
		System.out.println("Author: ");
		author = scan.next();
		System.out.println("Price: ");
		price = scan.nextDouble();
		System.out.println("Pages: ");
		pages = scan.nextInt();
		}
	public String toString(){
		return(name +" "+ author +" "+ price +" "+ pages);
		}
	}
class bookmain{
	public static void main(String arg[]){
		int n;
		System.out.println("Enter the number of books objects: ");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt(); 
		book lol[] = new book[n];
		for(int i = 0; i < n; i++){
			lol[i] = new book();
			lol[i].get_val();
			System.out.println("The Details of this book: ");
			System.out.println(lol[i].toString());
			}
		}
	}
		
	
	
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

