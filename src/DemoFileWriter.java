import java.io.BufferedWriter;
import java.io.FileWriter;

public class DemoFileWriter {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("/Users/lrandom/Desktop/demo-write-data.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Hello world");
            bufferedWriter.newLine();
            bufferedWriter.write("Hello world");
            bufferedWriter.newLine();
            bufferedWriter.write("Hello world");
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
