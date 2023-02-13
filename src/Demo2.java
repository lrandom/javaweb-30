public class Demo2 {
    public void print() {
        class InnerClass {
            public void print() {
                System.out.println("numberA =");
            }
        }

        InnerClass innerClassObj = new InnerClass();
        innerClassObj.print();
    }
}
