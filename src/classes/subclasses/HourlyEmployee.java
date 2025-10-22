package classes.subclasses;

import classes.Employee;
import classes.Gender;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {

    private double hourlyRate; // salary per hour
    private double hoursWorked;
    private double overtimeRate;

    public HourlyEmployee(int id, String name, Gender gender, LocalDate hireDate,
                          double hourlyRate, double hoursWorked, double overtimeRate) {
        super(id,name,gender,hireDate);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.overtimeRate = overtimeRate;
    }

    // Specific methods for HourlyEmployee
    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getOvertimeRate() {
        return overtimeRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    public void setOvertimeRate(double overtimeRate) {
        this.overtimeRate = overtimeRate;
    }
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        double regularHours = Math.min(hoursWorked, 40);
        double overtimeHours = Math.max(hoursWorked - 40, 0);
        double calculatedSalary = (regularHours * hourlyRate) + (overtimeHours * hourlyRate * overtimeRate);;
        return calculatedSalary;
    }
    @Override
    public String toString() {
        return super.toString() +
                String.format(", Type: Hourly, Rate: $%.2f, Hours: %.1f, Salary: $%.2f",
                        hourlyRate, hoursWorked, calculateSalary());
    }
}