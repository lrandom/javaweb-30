package service;

import models.Employee;

import java.io.*;
import java.util.ArrayList;

public class EmployManagerService {
    private ArrayList<Employee> list;
    public static final String DB_PATH = "/Users/lrandom/Documents/employee.dat";

    public EmployManagerService() {
        syncFromDB();
    }

    public void addEmployee(int id, String name, int age, float salary) {
        Employee employee = new Employee(id, name, age, salary);
        list.add(employee);
        syncToDB();
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
        ArrayList<Employee> listSort = new ArrayList<Employee>(list);
        listSort.sort((o1, o2) -> {
            if (o1.getSalary() < o2.getSalary()) {
                return 1;
            } else if (o1.getSalary() > o2.getSalary()) {
                return -1;
            } else {
                return 0;
            }
        });
        return listSort;
    }

    public void syncToDB() {
        try {
            FileOutputStream fos = new FileOutputStream(DB_PATH);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos);
            objectOutputStream.writeObject(list);
            fos.close();
            objectOutputStream.close();
        } catch (Exception e) {
            System.out.println("Không thể đồng bộ được dữ liệu");
        }
    }

    public void syncFromDB() {
        try {
            File file = new File(DB_PATH);
            if (!file.exists() || file.isDirectory()) {
                list = new ArrayList<Employee>();
                return;
            }

            FileInputStream fis = new FileInputStream(DB_PATH);
            ObjectInputStream objectInputStream = new ObjectInputStream(fis);
            list = (ArrayList<Employee>) objectInputStream.readObject();
            fis.close();
            objectInputStream.close();
        } catch (Exception e) {
            System.out.println("Không thể đồng bộ được dữ liệu");
        }
    }
}
