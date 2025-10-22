package classes;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private Employee manager;
    private List<Employee> employees;

    public Department(String name, Employee manager) {
        this.name = name;
        this.manager = manager;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(int employeeId) {
        employees.removeIf(emp -> emp.getId() == employeeId);
    }

    public Employee findEmployee(int employeeId) {
        return employees.stream()
                .filter(emp -> emp.getId() == employeeId)
                .findFirst()
                .orElse(null);
    }

    public double calculateTotalPayroll() {
        return employees.stream()
                .mapToDouble(Employee::calculateSalary)
                .sum();
    }

    public void printAllEmployees() {
        System.out.println("Department: " + name + ", Manager: " + manager);
        System.out.println("Total Employees: " + employees.size());
        System.out.println("Total Payroll: $" + calculateTotalPayroll());
        System.out.println("----------------------------------------");

        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }

    // Getters
    public String getName() { return name; }
    public Employee getManager() { return manager; }
    public List<Employee> getEmployees() { return new ArrayList<>(employees); }
}
