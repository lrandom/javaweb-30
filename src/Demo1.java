public class Demo1 {
    static private int numberA = 20;
    static private int numberB = 10;
    static class InnerClass {
        public void print() {
            System.out.println("numberA = " + (numberA+numberB));
        }
    }

    public static void main(String[] args) {
        //Demo1 demo1 = new Demo1();
        //InnerClass innerClassObj = demo1.new InnerClass();
       // innerClassObj.print();
        Demo1.InnerClass innerClassObj = new Demo1.InnerClass();
        innerClassObj.print();
    }
}
