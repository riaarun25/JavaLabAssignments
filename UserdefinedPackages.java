/* Code 1 */
package p1.p2;

class games{
public void sudoko(){
System.out.println("This game is sudoko");
}
public static void main(String args[]){
games obj = new games();
obj.sudoko();
}
}


/* Code 2 */
package Test;
import SNU.geometryUtil.*;
import java.util.*;

public class Mainclass{
    
    public static void main(String args[]){
        Circle[] circles = new Circle[11]; //0
        Rectangle[] rect = new Rectangle[11]; // 1
        Square[] square = new Square[11]; //2
        Triangle[] triangles = new Triangle[11]; //3

        Scanner in = new Scanner(System.in);
        int choice  = -1;
        while(choice != 0){
            System.out.println("New Object or Browse? <1,2,[0-exit]>\n");
            choice = in.nextInt();
            
            if(choice == 0) System.exit(0);

            System.out.println("Choose Object type (Circle, Rectangle, Square, Triangle <0,1,2,3>\n");
            int object = in.nextInt();
            
            if(object == 0) {
                if(choice == 1){
                    Double input = in.nextDouble();
                    circles[Circle.getCounter()] = new Circle(input);
                }
                if(choice == 2){
                    for(int i = 0; i < Circle.getCounter(); i++){
                        System.out.println("Circle #"+i+" -> "+ "Area: " + circles[i].getArea() + " Perimeter: \n" + circles[i].getPerimeter());
                    }
                }
            }
            else if(object == 1){
                if(choice == 1){
                    Double l = in.nextDouble();
                    Double b = in.nextDouble();
                    rect[Rectangle.getCounter()] = new Rectangle(l,b);
                }
                if(choice == 2){
                    for(int i = 0; i < Circle.getCounter(); i++){
                        System.out.println("Rect #"+i+" -> "+ "Area: " + rect[i].getArea() + " Perimeter: \n" + rect[i].getPerimeter());
                    }
                }
            }
            else if(object == 2){
                if(choice == 1){
                    Double a = in.nextDouble();
                    
                    square[Square.getCounter()] = new Square(a);
                }
                if(choice == 2){
                    for(int i = 0; i < Square.getCounter(); i++){
                        System.out.println("Sqr #"+i+" -> "+ "Area: " + square[i].getArea() + " Perimeter: \n" + square[i].getPerimeter());
                    }
                }
            }
            else if(object == 3){
                if(choice == 1){
                    Double a = in.nextDouble();
                    Double b = in.nextDouble();
                    Double c = in.nextDouble();
                    
                    triangles[Triangle.getCounter()] = new Triangle(a,b,c);
                }
                if(choice == 2){
                    for(int i = 0; i < Square.getCounter(); i++){
                        System.out.println("Sqr #"+i+" -> "+ "Area: " + square[i].getArea() + " Perimeter: \n" + square[i].getPerimeter());
                    }
                }
            }
        }
    }
}


package SNU.geometryUtil;

public class Circle{
    private double radius;

    private static int counter = 0;

    public Circle(){
        counter++;
    }

    public Circle(double x){
        radius = x;
        counter++;
    }

    public static int getCounter(){
        return counter;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double x){
        radius = x;
    }

    public double getArea(){
        return 3.1415 * radius * radius;
    }
    public double getPerimeter(){
        return 2* 3.1415 * radius ;
    }
}



package SNU.geometryUtil;

public class Rectangle{
    private double l,b;
    
    private static int counter = 0;

    public Rectangle(){
        counter++;
    }

    public Rectangle(double x, double y){
        l = x;
        b = y;
        counter++;
    }

    public static int getCounter(){
        return counter;
    }

    public double getL(){
        return l;
    }
    public double getB(){
        return b;
    }

    public void setL(double x){
        l = x;
    }
    public void setB(double x){
        b = x;
    }


    public double getPerimeter(){
        return 2.0*(l+b);
    }

    public double getArea(){
        return l*b;
    }

}



package SNU.geometryUtil;

public class Square{
    private double a;

    private static int counter = 0;

    public Square(){
        counter++;
    }

    public Square(double x){
        a = x;
        counter++;
    }

    public static int getCounter(){
        return counter;
    }

    public double getA(){
        return a;
    }

    public void setA(double x){
        a = x;
    }


    public double getPerimeter(){
        return 4.0*a;
    }

    public double getArea(){
        return a*a;
    }

}



package SNU.geometryUtil;

public class Triangle{
    private double a,b,c;

    private static int counter = 0;
    public Triangle(){
        counter++;
    }
    public static int getCounter(){
        return counter;
    }
    public Triangle(double x,double y,double z){
        a = x;
        b = y;
        c = z;
        counter++;
    }
    public double getA(){
        return a;
    }

    public double getB(){
        return b;
    }

    public double getC(){
        return c;
    }
    public void setA(double x){
        a = x;
    }
    public void setB(double x){
        b = x;
    }
    public void setC(double x){
        c = x;
    }
    public double getPerimeter(){
        return a+b+c;
    }
    public double getArea(){
        double p = getPerimeter()/2.0;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

}
