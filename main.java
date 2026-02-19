import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            System.out.print("Enter Salary: ");
            float salary = sc.nextFloat();

            // Simple manual checks using throw
            if (age <= 0) {
                throw new Exception("Invalid age");
            }

            if (salary <= 0) {
                throw new Exception("Invalid salary");
            }

            // Print only if no exception
            System.out.println("\n--- Employee Details ---");
            System.out.println("Name   : " + name);
            System.out.println("Age    : " + age);
            System.out.println("Salary : " + salary);

        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        finally {
            System.out.println("\nData inserted successfully");
            sc.close();
        }
    }
}