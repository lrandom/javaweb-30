import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //"C:\\Users\\lrandom\\Desktop\\demo-data.txt"
        try {
            FileInputStream fileInputStream = new FileInputStream("/Users/lrandom/Desktop/demo-data.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            int data = 0;
            while ((data = bufferedInputStream.read()) != -1) {
                System.out.print((char) data);
            }
            fileInputStream.close();
            bufferedInputStream.close();
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
}