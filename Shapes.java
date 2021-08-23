import java.util.*;
abstract class Shape {
	int length, breadth, radius;
	Scanner input = new Scanner(System.in);
	abstract void printArea();
}

class Rectangle extends Shape {
	void printArea() {
		System.out.println("Area of Rectangle");
		System.out.print("Enter the Length and the Breadth: ");
		length = input.nextInt();
		breadth = input.nextInt();
		System.out.println("Area of rectangle is: " + length * breadth);
	}
}

class Triangle extends Shape {
	void printArea() {
		System.out.println("\nArea of Triangle");
		System.out.print("Enter Base and the Height: ");
		length = input.nextInt();
		breadth = input.nextInt();
		System.out.println("Area of triangle is: " + (length * breadth) / 2);
	}
}

class Cricle extends Shape {
	void printArea() {
		System.out.println("\nArea of Cricle");
		System.out.print("Enter Radius: ");
		radius = input.nextInt();
		System.out.println("Area of cricle is: " + 3.14f * radius * radius);
	}
}

public class AbstractClassExample {
	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		rec.printArea();

		Triangle tri = new Triangle();
		tri.printArea();
		
		Cricle cri = new Cricle();
		cri.printArea();
	}
}
