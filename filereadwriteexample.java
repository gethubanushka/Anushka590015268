import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class filereadwriteexample {

    public static void main(String[] args) {

        try {
            // -------- WRITING INTO FILE --------
            FileWriter fw = new FileWriter("sample.txt");
            fw.write("I am 19 year old");
            fw.close();
            System.out.println("File written successfully.");

            // -------- READING FROM FILE --------
            FileReader fr = new FileReader("sample.txt");
            int i;

            System.out.println("Reading from file:");
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }

            fr.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

