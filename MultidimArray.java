# Write a java program to demonstrate the use of multidimensional arrays and looping constraints.

import java.util.Scanner;
class MultidimensionalArrayDemo {
    public static void main(String args[]){
	Scanner  sc=new Scanner(System.in);
	System.out.println("\n\nProgram to demonstrate the use of multidimensional arrays and looping constraints");
	System.out.println("---------------------------------------------------------------------------------");
	System.out.println("\nEnter the number of rows: ");
	int a=sc.nextInt();
	System.out.println("Enter the number of columns: ");
	int b=sc.nextInt(); 
	System.out.println("Enter the elements: ");
	int arr[][]=new int[a][b];
	for(int i=0;i<a;i++){
	for(int j=0;j<b;j++){
	    arr[i][j]=sc.nextInt();
	}
	}
    System.out.println("\nThe matrix formed is: ");
    for(int i=0;i<a;i++){
	for(int j=0;j<b;j++){
	    System.out.print(arr[i][j]+"   ");
	}
	System.out.println();
	}
    }
}
