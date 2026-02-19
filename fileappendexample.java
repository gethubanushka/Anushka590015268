import java.io.FileWriter;
import java.io.IOException;

public class fileappendexample {
    public static void main(String[] args) {

        try {
            FileWriter fw = new FileWriter("sample.txt", true); // true = append mode
            fw.write("\nThis line is appended.");
            fw.close();

            System.out.println("Data appended successfully.");
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
} 
