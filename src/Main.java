public class Main {
    public static void main(String[] args) {
        /*MyThread t = new MyThread();
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        MyThread t2 = new MyThread();
        t2.start();

        try {
            t2.join();
        } catch (Exception e) {

        }

        Thread t3 = new Thread(new MyThread2());
        t3.start();*/

        /*MyThread t1 = new MyThread("Thread 1");
        MyThread t2 = new MyThread("Thread 2");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();*/

        /*Employee employee = new Employee();
        MyThread3 t1 = new MyThread3(employee);
        MyThread4 t2 = new MyThread4(employee);
        t1.start();
        t2.start();*/
        Person person = new Person();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                person.wake();
                person.working();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                person.eat();
            }
        });

        t1.start();
        t2.start();
    }
}
