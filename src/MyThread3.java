public class MyThread3 extends Thread {
    private Employee employee;

    public MyThread3(Employee employee) {
        this.employee = employee;
    }

    public void run() {
        employee.setSalary(50000);
        try {
            sleep(1000);
        } catch (Exception e) {

        }
    }
}
