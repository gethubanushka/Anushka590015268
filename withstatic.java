import java.util.Scanner;

public class withstatic {
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = sc.nextInt(); 

        System.out.println("You entered: " + n);
    }
}