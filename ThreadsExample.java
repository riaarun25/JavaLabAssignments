import java.util.Scanner;
import java.util.Random;

public class threading{
    static Scanner input= new Scanner(System.in);
    public static void main(String[] args){
        OuterToCity outer_to_city = new OuterToCity();
        CityToOuter city_to_outer = new CityToOuter();
        boolean thread_started_1 = false, thread_started_2 = false;

        while(true){
            System.out.print("\n1. Add a car for Outer to City\n2. Add a car from City to Outer\n3. Quit\n>> ");
            int choice; 
            choice = input.nextInt();

            if (choice == 1){
                outer_to_city.add_new_car();
                if (thread_started_1==false){
                    outer_to_city.start();
                    thread_started_1 = true;
                }  
            }
            else if (choice ==2){
                city_to_outer.add_new_car();
                if (thread_started_2==false){
                    city_to_outer.start();
                    thread_started_2 = true;
                }  
            }
            else if (choice == 3){
                System.exit(0);
            }
            else{
                System.out.println("\nInvalid choice try again!");
            }
        }
    }
}

class OuterToCity extends Thread{
    public int cars_outer;

    OuterToCity(){
        Random rand = new Random();
        this.cars_outer = rand.nextInt(10);
    }
    synchronized void add_new_car(){
        cars_outer++;
        System.out.println("\nCars on outer end: "+cars_outer);
    }

    public void run(){
        while(true){
            if (cars_outer >= 10){
                cars_outer = 0;
                System.out.println("\nGreen Light was allowed for Outer to City.");
            }

            try{
                Thread.sleep(100);}
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

class CityToOuter extends Thread{
    public int cars_city;

    CityToOuter(){
        Random rand = new Random();
        this.cars_city = rand.nextInt(10);
    }

    synchronized void add_new_car(){
        cars_city++;
        System.out.println("\nCars on city end: "+cars_city);
    }
    public void run(){
        while(true){       
            if (cars_city >= 10){
                cars_city = 0;
                System.out.println("\nGreen Light was allowed for City to Outer");
            }

            try{
                Thread.sleep(100);}
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
