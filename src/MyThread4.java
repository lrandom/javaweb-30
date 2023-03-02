public class MyThread4 extends Thread {
    private Employee employee;

    public MyThread4(Employee employee) {
        this.employee = employee;
    }

    public void run() {
        System.out.println(employee.getSalary());
        try {
            sleep(1000);
        } catch (Exception e) {

        }
    }
}
