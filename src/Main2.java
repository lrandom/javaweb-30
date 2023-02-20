import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số a");
        do {
            try {
                a = scanner.nextInt();
                break;
            } catch (Exception e) {
                scanner = new Scanner(System.in);
                System.out.println("Vui lòng nhập lại số a");
            }
        } while (true);

        System.out.println("Nhập vào số b");
        do {
            try {
                b = scanner.nextInt();
                break;
            } catch (Exception e) {
                scanner = new Scanner(System.in);
                System.out.println("Vui lòng nhập lại số b");
            }
        } while (true);

        System.out.println("Tổng hai số là" + (a + b));
    }
}
