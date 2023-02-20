import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int c = 0;
        int a = 10;
        int d = 0;

        System.out.println("Vui lòng nhập vào số chia");
        Scanner scanner = new Scanner(System.in);
        d = scanner.nextInt();

        try {
            System.out.println(d);
            c = a / d;
        } catch (ArithmeticException exception) {
            System.out.println("Vui lòng nhập lại số chia khác 0");
            d = scanner.nextInt();
            c = a / d;
        }

        System.out.println("Kết quả phép chia là " + c);
    }
}