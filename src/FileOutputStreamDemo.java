import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/lrandom/Desktop/demo-write-data.txt", true);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            bufferedOutputStream.write("Hello world".getBytes());
            //fileOutputStream.write("Hello world".getBytes());
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
