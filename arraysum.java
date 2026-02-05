
import java.util.Scanner;

public class arraysum {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int arr[] = new int[5];
        int sum = 0;

        System.out.println("Enter 5 elements:");

        for (int i = 0; i < 5; i++) {
            arr[i] = s.nextInt();
            sum += arr[i];
        }

        System.out.println("Sum of array elements: " + sum);
    }
}
