package pro.sky.java.course2.hw_25_collections_sets.service;

import pro.sky.java.course2.hw_25_collections_sets.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee addEmployee(String firstName, String lastName);
    Employee removeEmployee(String firstName, String lastName);
    Employee findEmployee(String firstName, String lastName);
    List<Employee> printEmployees();
}
