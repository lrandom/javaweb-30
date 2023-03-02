public class Person {
    public synchronized void wake() {
        System.out.println("I am wake up");
    }

    public synchronized void working() {
        System.out.println("I am working");
        try {
            wait();
        } catch (Exception e) {

        }
        System.out.println("I am working again");
    }

    public synchronized void eat() {
        System.out.println("I am eating");
        try {
            notify();
        } catch (Exception e) {

        }
    }
}
