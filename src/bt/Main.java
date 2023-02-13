package bt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username, password;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui long nhap user va pass");
        username= scanner.nextLine();
        password= scanner.nextLine();


        ATMManager atmManager = new ATMManager();

        if (atmManager.login(username, password) == -1) {
            System.out.println("Sai user hoac pass, vui long thu lai");
        }else{
            int choice = 0;
            do {
                System.out.println("1. Rut tien");
                System.out.println("2. Xem so du");
                System.out.println("3. Thoat");
                System.out.println("Vui long chon chuc nang");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Vui long nhap so tien can rut");
                        float amount = scanner.nextFloat();
                        float remindAmount = atmManager.widthdraw(amount);
                        System.out.println("Rut tien thanh cong");
                        System.out.println("So tien con lai la "+atmManager.formatAmount(remindAmount));
                        break;

                    case 2:
                        System.out.println("So du cua ban la "+atmManager.formatAmount(atmManager.getBalance()));
                        break;
                }
            } while (choice!=3);
        }

    }
}
