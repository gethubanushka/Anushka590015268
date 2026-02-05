import java.util.Scanner;
class static1 {
    int n; 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        static1 obj = new static1();

        System.out.print("Enter a number: ");
        obj.n = sc.nextInt();

        System.out.println("You entered: " + obj.n);
    }
}