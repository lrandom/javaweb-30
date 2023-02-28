import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            /*ArrayList list = new ArrayList();
            list.add(new String("Hello"));
            String hello = (String) list.get(0);*/
            ArrayList<String> list = new ArrayList<String>();
            list.add(new String("Hello"));
            String hello = list.get(0);
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
}