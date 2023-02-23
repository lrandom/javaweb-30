import java.io.FileOutputStream;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/lrandom/Desktop/demo-write-data.txt", true);
            fileOutputStream.write("Hello world".getBytes());
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
