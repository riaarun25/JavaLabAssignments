# Write a Java program to demonstrate the application of String handling functions.

class StringDemo
{
  public static void main(String args[])
  {
	String a="This is a Java Program. ";
  	String b="The class name is StringDemo. ";
  	System.out.println("\n Assignment 2" );
  	System.out.println("\n*************************************" );
  	
  	System.out.println("\nString a ---> "+a);
  	System.out.println("String b ---> "+b);
  	System.out.println("\nAfter concatenation ---> "+a.concat(b));
  	
  	System.out.println("Comparing the two strings ---> "+a.compareTo(b));
  	System.out.println("\nCharacter at 13th place of string a ---> "+a.charAt(13));
  	System.out.println("Character at 6th place of string a ---> "+b.charAt(6));
  	System.out.println("\nBoolean comparison ---> "+a.equalsIgnoreCase(b));
  	System.out.println("Comparison (a to b)---> "+a.compareTo(b));
  	System.out.println("Comparison (b to a)---> "+b.compareTo(a));
  	
  	System.out.println("Length of string b ---> "+b.length());
  	System.out.println("\nSubstring of string b ---> "+b.substring(12));
  	System.out.println("Substring of string a ---> "+a.substring(10,21));
  	System.out.println("\nLower case ---> "+a.toLowerCase());
  	System.out.println("	   ---> "+b.toLowerCase());
  	System.out.println("\nUpper Case ---> "+a.toUpperCase());
  	System.out.println("	   ---> "+b.toUpperCase());
  	
  	System.out.println("\nReplacement ---> "+b.replace("StringDemo", "NewClass"));
  	System.out.println("Trimed string a ---> "+a.trim());
  	System.out.println("\nChecking start ---> "+a.startsWith("This"));
  	System.out.println("Checking end---> "+a.endsWith("Program"));
  }
}
