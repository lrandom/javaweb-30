public class B4 {
    public static void main(String[] args) {
        int[] arr = {3, 4, 10, 4, 5, 6, 4, 2, 4, 5, 6,10};
        int max = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Max is: "+max);

    }
}
