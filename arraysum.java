import java.util.Scanner;
public class arraysum {
    int sum =0; 
    int arr[]=new int[5];
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        {arraysum as = new arraysum ("enter any 5 number:");
            for(int i=0; i<5; i++) {
                as.arr[i]=s.nextInt();
                as.sum+=as.arr[i];
                System.out.println("sum of array element" + as.sum);

            
            }

        }

    }
    

    
}
