/* Single Inheritance */
class Humans{  
void emotional(){System.out.println("Humans are emotional.");}  
}  
class Females extends Humans{  
void veryemotional(){System.out.println("Females are generally more emotional than men.");}  
}  
class SingleInheritance{  
public static void main(String args[]){  
Females d=new Females();  
d.veryemotional();  
d.emotional();  
}
}  


/* Multilevel Inheritance */
class StartConversation{  
void hello(){System.out.println("Hello! Welcome to this Java program.");}  
}  
class AskQuestion extends StartConversation{  
void AskName(){System.out.println("What is your name?");}  
}  
class FullName extends AskQuestion{  
void AskFullName(){System.out.println("What is your full name?");}  
}  
class MultilevelInheritance{  
public static void main(String args[]){  
FullName d=new FullName();  
d.AskName();  
d.AskFullName();  
d.hello();  
}
}  


/* Hierarchical Inheritance */
package P1;
class Members{
float Number = 10;
void dispNumber()
{
System.out.println("Number of members:" +Number);
}
}
class PermanentMem extends Members{
double hike = 0.5;
void increasedNumber()
{
System.out.println("The increased number is:" +(Number+(Number * hike)));
}
}
class TemporaryMem extends Members{
double hike = 0.35;
void temporaryNumber()
{
System.out.println("The Temporary increase is :" +(Number+(Number * hike)));
}
}
public class HInheritance
{
public static void main(String args[]){
PermanentMem p = new PermanentMem();
TemporaryMem t = new TemporaryMem();
p.dispNumber();
p.increasedNumber();
t.dispNumber();
t.temporaryNumber();
}
}


/* Hybrid Inheritance */
class c{
   public void disp(){
	System.out.println("Hello!");
   }
}
class A extends c{
   public void disp(){
	System.out.println("Nice to meet you.");
   }
}
class B extends c{
   public void disp(){
	System.out.println("I'm Ria.");
   }
	
}
class D extends A{
   public void disp(){
	System.out.println("Welcome!");
   }
   public static void main(String args[]){

	D obj = new D();
	obj.disp();
   }
}

