import java.util.Scanner;
public class stringcheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two strings
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // Compare using equals()
        if (str1.equals(str2)) {
            System.out.println("The two strings are the same.");
        } else {
            System.out.println("The two strings are NOT the same.");
        }
    }
}
    

