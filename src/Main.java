import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Nghĩa \n \"bóng\" ");
        //int num = 10;
        //System.out.println(++num);//10
        //System.out.println(num);//11
        /*int a = 20;
        long b  = a;//chuyển ngầm định

        int c = 20;
        short d = (short) c;//chuyển tường minh*/

        System.out.println("Vui lòng nhập vào tuổi");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age <= 12) {
            System.out.println("Bạn là trẻ em");
        } else if (age <= 18) {
            System.out.println("Bạn là thanh thiếu niên");
        } else if (age <= 30) {
            System.out.println("Bạn là thanh niên");
        } else if (age <= 50) {
            System.out.println("Bạn là trung niên");
        } else {
            System.out.println("Bạn là người già");
        }

        //switch case
        switch (age) {
            case 1:
                System.out.println("Bạn là trẻ em");
                break;
            case 2:
                System.out.println("Bạn là thanh thiếu niên");
                break;
            case 3:
                System.out.println("Bạn là thanh niên");
                break;
            case 4:
                System.out.println("Bạn là trung niên");
                break;
            default:
                System.out.println("Bạn là người già");
                break;
        }
    }
}