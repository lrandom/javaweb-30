package bt;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        float a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so a");
        a = scanner.nextFloat();

        System.out.println("Nhap so b");
        b = scanner.nextFloat();

        Calculator calculator = new Calculator();
        System.out.println("Ket qua phep cong la");
        System.out.println(calculator.add(a, b));

        System.out.println("Ket qua phep tru la");
        System.out.println(calculator.sub(a, b));

        System.out.println("Ket qua phep nhan la");
        System.out.println(calculator.multiple(a, b));

        System.out.println("Ket qua phep chia");
        System.out.println(calculator.divide(a,b));
    }
}
