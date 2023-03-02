public class Employee {
    private float salary = 40000;

    public synchronized float getSalary() {
        return salary;
    }

    public synchronized void setSalary(float salary) {
        this.salary = salary;
    }
}
