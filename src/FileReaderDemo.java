import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderDemo {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("/Users/lrandom/Desktop/demo-data.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            fileReader.close();
            bufferedReader.close();
        } catch (Exception e) {

        }
    }
}
