public class Student extends Human {
    public void run() {
        System.out.println("Student is running");
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.run();
    }
}
