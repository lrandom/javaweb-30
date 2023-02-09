

import models.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Human luan = new Human("Luân", 30, 1.7f, 72, "123456789");
        luan.walk();
        luan.eat();
        luan.sleep();

        Human toan = new Human("Toàn", 30, 1.7f, 72, "123456789");
        toan.walk();
        toan.eat();
        toan.sleep();

        System.out.println(Human.className);
        System.out.println(Human.getClassName());

        models.Human myMan = new models.Human();
        Animal animal = new Animal();
    }
}