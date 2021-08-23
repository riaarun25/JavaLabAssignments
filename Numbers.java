java.util.Scanner;
class MyException extends Exception{
   int n;
   MyException(int n) {
	n<=0;
   }
   public String toString(){ 
	return ("Invalid") ;
   }
}

class Average
{
     public static void main(String args[])
	
     {
          int n;double res=0;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter how many numbers to calculate the average: ");
          n=sc.nextInt();
	  
	  int a[]=new int[n];
	  System.out.println("Enter "+n+" numbers: ");
          for(int i=0;i<n;i++)
 	       a[i]=sc.nextInt();
	  res=Average.CalAvg(a,n); 
  	  System.out.println("The Average = "+res/n);
     }
	
       static double CalAvg(int  a[],int n)
       {
	   double res=0;
	   for(int i=0;i<n;i++)
	       res =res+a[i];
	   return res;
        }
}
