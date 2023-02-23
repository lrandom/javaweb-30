import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class DemoWriteObject {
    public static void main(String[] args) {
        User luan = new User();
        luan.setName("Nguyễn Thành Luân");
        luan.setAge(31);
        try{
            FileOutputStream fos = new FileOutputStream("/Users/lrandom/Desktop/data.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos);
            objectOutputStream.writeObject(luan);
            objectOutputStream.flush();
            objectOutputStream.close();
            fos.close();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
