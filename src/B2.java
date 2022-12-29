import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        int num1, num2, choose;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập số thứ nhất: ");
        num1 = scanner.nextInt();
        System.out.println("Vui lòng nhập số thứ hai: ");
        num2 = scanner.nextInt();
        do {
            System.out.println("1. Tính tổng hai số và in ra màn hình");
            System.out.println("2. Tính hiệu hai số và in ra màn hình");
            System.out.println("3. Tính tích hai số và in ra màn hình");
            System.out.println("4. Tính thương hai số và in ra màn hình");
            System.out.println("5. Thoát ctrinh");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Tổng hai số là: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Hiệu hai số là: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Tích hai số là: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("Thương hai số là: " + (num1 / num2));
                    break;
            }
        } while (choose != 5);
    }
}
