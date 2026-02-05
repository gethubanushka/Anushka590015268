import java.util.Scanner;
class static2 {
    int n; 
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        static2 obj = new static2();

        System.out.print("Enter a number: ");
        obj.n = sc.nextInt(); 
        System.out.println("You entered: " + obj.n); 
    }
}

