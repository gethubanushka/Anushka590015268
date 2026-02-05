import java.util.Scanner;

public class frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to find frequency: ");
        int target = sc.nextInt();

        int count = 0;
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }
         System.out.println("Frequency of " + target + " is: " + count);
    }
}
    

