public class Demo {
    public static void main(String[] args) {
        //Cách khai báo thứ 1
        int arr[] = new int[5];
        arr[0]=1;
        arr[1]=2;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int item:arr
             ) {
            System.out.println(item);
        }

        //Cách khai báo thứ 2
        int arr2[] = {1,2,3,4,5};
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
