
    import java.util.Scanner;

public class Car {
    int model_year;
    int mileage;
public static void main(String[] args) {
    Car c1=new Car();
    Car c2= new Car();
    Scanner S = new Scanner();
    System.out.println("Enter details of first car:");
        System.out.print("Enter model year: ");
        c1.model_year = S.nextInt();
        System.out.print("Enter mileage: ");
        c1.mileage = S.nextInt();

         System.out.println("\nEnter details of second car:");
        System.out.print("Enter model year: ");
        c2.model_year = S.nextInt();
        System.out.print("Enter mileage: ");
        c2.mileage = S.nextInt();

        System.out.println("\nFirst Car Details:");
        System.out.println("Model Year: " + c1.model_year);
        System.out.println("Mileage: " + c1.mileage);

        System.out.println("\nSecond Car Details:");
        System.out.println("Model Year: " + c2.model_year);
        System.out.println("Mileage: " + c2.mileage);
    
}
}
