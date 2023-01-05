public class Demo2 {
    public static void main(String[] args) {
        //Cách khai báo thứ 1
        int arr[][] = new int[2][3]; //2 dòng 3 cột
        arr[0][0]=1;
        arr[0][1]=2;
        arr[0][2]=3;
        arr[1][0]=4;
        arr[1][1]=5;
        arr[1][2]=6;

        //duyệt theo hàng
       /* for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d",arr[i][j]);
            }
            System.out.printf("\n");
        }*/

        //cách khai báo thứ 2
   /*     int arr2[][] = {{1,2,3},{4,5,6}};
        for(int[] item:arr2
             ) {
            for (int item2:item
                 ) {
                System.out.printf("%d",item2);
            }
            System.out.printf("\n");
        }*/
        //String a = "Hello";
        //a ="world";
        //System.out.println(a);

        String a = "hello";
        String b = "hello";
        //System.out.println(a == b);

        String c = new String("hello");
        String d = new String("Hello");
        //System.out.println(c.equals(d));
        //System.out.println(c.length());
        //System.out.println(d.charAt(0));

        /*char[] e = {'h','e','l','l','o'};
        d.getChars(0,2,e,1);
        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i]);
        }*/

        String e = new String("Hello");
        String f = new String("Hello");
        System.out.println(f.compareTo(e));
        System.out.println("Hello".startsWith("He"));
        System.out.println("Hello".indexOf("e"));//1
        System.out.println("Hello".lastIndexOf("o"));//0

        String sub = "Hello World".substring(6);
        System.out.println(sub);//World

        String a1 = "Hello";
        String a2 = a1.concat("World");
        System.out.println(a2);//HelloWorld

        System.out.println("Hello".replace('l','w'));//

        System.out.println(" Hello ".trim());//Hello

    }
}
