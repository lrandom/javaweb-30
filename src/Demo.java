import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui long so A");
        //nhận số a từ bàn phím
        a = scanner.nextInt();
        System.out.println("Vui long so B");
        b = scanner.nextInt();
        System.out.println("Tong cua 2 so la: " + (a + b));
    }
}
