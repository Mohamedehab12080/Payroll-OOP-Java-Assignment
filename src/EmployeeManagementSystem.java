//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import classes.Department;
import classes.Employee;
import classes.Gender;
import classes.subclasses.CommissionEmployee;
import classes.subclasses.HourlyEmployee;
import classes.subclasses.MonthlyEmployee;

import java.time.LocalDate;

public class EmployeeManagementSystem {
    public static void main(String[] args) {

        MonthlyEmployee managerEmployee=new MonthlyEmployee(100,"Mohamed Ehab",Gender.MALE, LocalDate.of(2020,2,10),20000,15,0.1,true);
        // Create department
        Department itDepartment = new Department("IT", managerEmployee);

        itDepartment.addEmployee(managerEmployee);
        // Create different types of employees
        HourlyEmployee hourlyEmp = new HourlyEmployee( 101,"Dalia Khalid", Gender.FEMALE,
                LocalDate.of(2020, 3, 15), 25.0, 45, 1.5);

        CommissionEmployee commissionEmp = new CommissionEmployee(102,"Ahmed Mohamed",Gender.MALE,
                LocalDate.of(2019, 7, 1), 2000, 0.15, 50000);

        MonthlyEmployee monthlyEmp = new MonthlyEmployee( 103,"Mariam Ahmed",Gender.FEMALE,
                LocalDate.of(2018, 1, 10), 5000, 15, 0.1, true);

        // Add employees to department
        itDepartment.addEmployee(hourlyEmp);
        itDepartment.addEmployee(commissionEmp);
        itDepartment.addEmployee(monthlyEmp);

        // Print all employees
        itDepartment.printAllEmployees();

        System.out.println("\n=== Individual Employee Details ===");

        // Demonstrate polymorphism
        Employee[] employees = {hourlyEmp, commissionEmp, monthlyEmp};

        for (Employee emp : employees) {
            System.out.println("Name: " + emp.getName() +
                    ", Type: " + emp.getClass().getSimpleName() +
                    ", Salary: $" + emp.calculateSalary());
        }

        // Demonstrate specific class methods
        System.out.println("\n=== Specific Employee Operations ===");

        // Hourly employee specific
        hourlyEmp.setHoursWorked(50);
        System.out.println(hourlyEmp.getName() + " new salary with overtime: $" +
                hourlyEmp.calculateSalary());

        // Commission employee specific
        commissionEmp.setSalesAmount(75000);
        System.out.println(commissionEmp.getName() + " commission: $" +
                commissionEmp.calculateCommission());

        // Monthly employee specific
        System.out.println(monthlyEmp.getName() + " total vacation days: " +
                (monthlyEmp.getVacationDays() + monthlyEmp.calculateAdditionalVacation()));
    }
}