package classes.subclasses;

import classes.Employee;
import classes.Gender;

import java.time.LocalDate;

public class MonthlyEmployee extends Employee {

    private int vacationDays;
    private double monthlySalary;
    private double bonusPercentage;
    private boolean hasHealthInsurance;

    public MonthlyEmployee(int id, String name, Gender gender, LocalDate hireDate,
                           double monthlySalary, int vacationDays,
                           double bonusPercentage, boolean hasHealthInsurance) {
        super(id, name, gender, hireDate);
        this.monthlySalary = monthlySalary;
        this.vacationDays = vacationDays;
        this.bonusPercentage = bonusPercentage;
        this.hasHealthInsurance = hasHealthInsurance;
    }

    @Override
    public double calculateSalary() {
        double bonus = monthlySalary * bonusPercentage;
        return monthlySalary + bonus;
    }

    // Specific methods for MonthlyEmployee
    public double getMonthlySalary() {
        return monthlySalary;
    }

    public int getVacationDays() {
        return vacationDays;
    }

    public double getBonusPercentage() {
        return bonusPercentage;
    }

    public boolean hasHealthInsurance() {
        return hasHealthInsurance;
    }

    public void setBonusPercentage(double bonusPercentage) {
        this.bonusPercentage = bonusPercentage;
    }

    public int calculateAdditionalVacation() {
        int years = getYearsOfService();
        return Math.min(years * 2, 20); // Max 20 additional days
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format(", Type: Monthly, Salary: $%.2f, Vacation: %d days, Total Salary: $%.2f",
                        monthlySalary, vacationDays + calculateAdditionalVacation(), calculateSalary());
    }
}
