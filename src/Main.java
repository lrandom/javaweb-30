import models.Employee;
import service.EmployManagerService;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployManagerService employManagerService = new EmployManagerService();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 5) {
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Hiển thị danh sách nhân viên");
            System.out.println("3. Tìm kiếm nhân viên theo id");
            System.out.println("4. Sắp xếp nhân viên theo lương");
            System.out.println("5. Thoát");
            System.out.println("Mời bạn chọn chức năng");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập id");
                    int id = scanner.nextInt();
                    System.out.println("Nhập tên");
                    String name = scanner.next();
                    System.out.println("Nhập tuổi");
                    int age = scanner.nextInt();
                    System.out.println("Nhập lương");
                    float salary = scanner.nextFloat();
                    employManagerService.addEmployee(id, name, age, salary);
                    break;
                case 2:
                    ArrayList<Employee> list = employManagerService.getList();
                    for (Employee employee : list) {
                        System.out.println("Id" + employee.getId());
                        System.out.println("Lương" + employee.getSalary());
                        System.out.println("Họ tên" + employee.getName());
                        System.out.println("Tuổi" + employee.getAge());
                        System.out.println("------------------------------");
                    }
                    break;
                case 3:
                    System.out.println("Nhập id cần tìm");
                    int idSearch = scanner.nextInt();
                    Employee employee = employManagerService.getEmployeeById(idSearch);
                    if (employee != null) {
                        System.out.println("Id" + employee.getId());
                        System.out.println("Lương" + employee.getSalary());
                        System.out.println("Họ tên" + employee.getName());
                        System.out.println("Tuổi" + employee.getAge());
                    } else {
                        System.out.println("Không tìm thấy nhân viên");
                    }
                    break;
                case 4:
                    ArrayList<Employee> listSort = employManagerService.getEmployeeOrderBySalary();
                    for (Employee employeeSort : listSort) {
                        System.out.println("Id " + employeeSort.getId());
                        System.out.println("Lương " + employeeSort.getSalary());
                        System.out.println("Họ tên " + employeeSort.getName());
                        System.out.println("Tuổi " + employeeSort.getAge());
                        System.out.println("------------------------------");
                    }
                    break;
                case 5:
                    System.out.println("Thoát");
                    break;
                default:
                    System.out.println("Chức năng không tồn tại");
                    break;
            }
        }
    }
}