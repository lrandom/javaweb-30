public class B2 {
    public static void main(String[] args) {
        int[] arr = {3,4,10,4,5,6,4,2,4,5,6};
        for (int i = 0; i < arr.length; i++) {
            int item = arr[i];
            int n = 1;
            for (int j = 1; j <= item; j++) {
                n*=j;
            }
            System.out.println("Giai thua cua so " + item + " la: " + n);
        }
    }
}
