import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.Scanner;

public class DemoDownloadFile {
    public static void main(String[] args) {
        String link = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập link file bạn muốn download");
        link = scanner.nextLine();
        try {
            URL url = new URL(link);
            //https://google.com.vn/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png
            BufferedInputStream fis = new BufferedInputStream(url.openStream());
            String splitLinks[] = link.split("\\/");
            //String ext = splitLinks[splitLinks.length - 1];
            String name = splitLinks[splitLinks.length - 1];
            FileOutputStream fos = new FileOutputStream("/Users/lrandom/Desktop/"+name);
            //byte[] buffer = new byte[1024];
            int data = 0;
            while ((data=fis.read()) != -1) {
                fos.write(data);
            }
            fos.flush();
            fis.close();
            fos.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
