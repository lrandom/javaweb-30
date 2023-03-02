public class MyThread5 extends Thread {
    private Person person;

    public MyThread5(Person person) {
        this.person = person;
    }

    @Override
    public void run() {
        super.run();
        this.person.wake();
    }
}
