import java.util.StringTokenizer;

public class Demo3 {
    public static void main(String[] args) {
        String hello = "Hello, I am Luan";
        StringTokenizer tokenizer = new StringTokenizer(hello,",",true);
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}
