import java.util.Scanner;

public class array {
    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        int arr[] = new int[3];

        System.out.println("Enter 3 elements:");

        for (int i = 0; i < 3; i++) {
            arr[i] = Sc.nextInt();
        }

        System.out.println("Array elements are:");

        for (int i = 0; i < 3; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

