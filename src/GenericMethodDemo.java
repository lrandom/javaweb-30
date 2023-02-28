public class GenericMethodDemo {
    public <T> void display(T object) {
        System.out.println("Display record with id");
    }


    public static void main(String[] args) {
        GenericMethodDemo genericMethodDemo = new GenericMethodDemo();
        genericMethodDemo.display(new String("Hello"));
        genericMethodDemo.display(Integer.valueOf(10));
        genericMethodDemo.display(Float.valueOf(10.5f));
    }

}
