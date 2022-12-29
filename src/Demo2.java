public class Demo2 {
    public static void main(String[] args) {
        /*for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }*/

       /* while(true){
            System.out.println("Vòng lặp while");
            break;
        }*/

        /*int index = 10;
        do {
            System.out.println(index);
            index++;
        } while (index<20);*/

        //break
        //continue
        /*for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }*/
        //0,1,2,3,4,6,7,8,9

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        //duyệt mảng/tập hợp
        for (int num : nums
        ) {
            System.out.println(num);
        }


    }
}
