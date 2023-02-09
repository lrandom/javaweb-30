package bt2;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        float width,height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài");
        width = scanner.nextFloat();
        height = scanner.nextFloat();
        HinhChuNhat hinhChuNhat = new HinhChuNhat(width,height);

        System.out.println("Chu vi là"+hinhChuNhat.chuVi());
    }
}
