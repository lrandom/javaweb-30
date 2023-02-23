import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DemoReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("/Users/lrandom/Desktop/data.dat");
            ObjectInputStream objectInputStream = new ObjectInputStream(fis);
            User user = (User) objectInputStream.readObject();
            System.out.println(user.getName());
            System.out.println(user.getAge());
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
