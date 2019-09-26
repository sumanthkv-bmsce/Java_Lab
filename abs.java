import java.util.*;

abstract class Shape{
	int a;
	Shape(){
		a = 1;
		}
	
	Shape(int x){
		a = x;
		}
	
	abstract void calc();
	}

class Rectangle extends Shape{
	int b;
	Rectangle(){
		b = 1;
		}
	
	Rectangle(int x, int y){
		a = x;
		b = y;
		}
	void calc(){
		System.out.println(a*b);
		}
	}

class Triangle extends Shape{
	int b;
	Triangle(){
		b = 1;
		}
	
	Triangle(int x, int y){
		a = x;
		b = y;
		}
	void calc(){
		System.out.println(0.5*a*b);
		}
	}

class Circle extends Shape{
	Circle(int x){
		a = x;
		}
	void calc(){
		System.out.println(3.14*a*a);
		}
	}

class Square extends Shape{
	Square(int x){
		a = x;
		}
	void calc(){
		System.out.println(a*a);
		}
	}

class abs{
	public static void main(String arg[]){
		int a;
		int b;
		int x = 0;
		while(x != 5){
			System.out.println("\nEnter 1: Rectangle, 2: Square, 3: Circle, 4: Triangle, 5: Exit\n");
			Scanner scan = new Scanner(System.in);
			x = scan.nextInt();
			switch(x){
				case 1: 
					System.out.println("Enter Value a for Rectangle");
					a = scan.nextInt();
					System.out.println("Enter Value b for Rectangle");
					b = scan.nextInt();
					Rectangle r = new Rectangle(a, b);
					r.calc();
					break;
				case 2:
					System.out.println("Enter Value a for Square");
					a = scan.nextInt();
					Square s = new Square(a);
					s.calc();
					break;
				case 3:
					System.out.println("Enter Value a for Circle");
					a = scan.nextInt();
					Circle c = new Circle(a);
					c.calc();
					break;
				case 4:
					System.out.println("Enter Value a for Triangle");
					a = scan.nextInt();
					System.out.println("Enter Value b for Triangle");
					b = scan.nextInt();
					Triangle t = new Triangle(a, b);
					t.calc();
					break;
				}
			}
		}
	}
	
