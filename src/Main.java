import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Human luan = new Human();
        luan.name = "Luân";
        luan.age = 30;
        luan.walk();
        luan.eat();
        luan.sleep();

        Human toan = new Human();
        toan.name = "Toan";
        toan.age = 30;
        toan.walk();
        toan.eat();
        toan.sleep();
    }
}