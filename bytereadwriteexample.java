import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class bytereadwriteexample {

    public static void main(String[] args) {

        try {
            // -------- WRITING INTO FILE --------
            FileOutputStream fos = new FileOutputStream("sample.txt");
            String data = "hii i am anushka";
            fos.write(data.getBytes());
            fos.close();
            System.out.println("Data written successfully.");

            // -------- READING FROM FILE --------
            FileInputStream fis = new FileInputStream("sample.txt");
            int i;

            System.out.println("Reading data from file:");
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }

            fis.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

