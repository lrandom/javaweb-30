package service;

import models.Employee;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class EmployManagerService {
    private ArrayList<Employee> list;
    public static final String DB_PATH = "/Users/lrandom/Documents/employee.dat";

    public EmployManagerService() {

    }

    public void addEmployee(int id, String name, int age, float salary) {
        Employee employee = new Employee(id, name, age, salary);
        list.add(employee);
    }

    public ArrayList<Employee> getList() {
        return list;
    }

    public Employee getEmployeeById(int id) {
        for (Employee employee : list) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public ArrayList<Employee> getEmployeeOrderBySalary() {
        return null;
    }

    public void syncDB() {
        try {
            FileInputStream fileInputStream = new FileInputStream(DB_PATH);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        } catch (Exception e) {

        }
    }
}
