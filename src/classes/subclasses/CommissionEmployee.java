package classes.subclasses;

import classes.Employee;
import classes.Gender;

import java.time.LocalDate;

public class CommissionEmployee extends Employee {

    private double baseSalary;
    private double commissionRate;
    private double salesAmount;

    public CommissionEmployee(int id, String name, Gender gender, LocalDate hireDate,
                              double baseSalary, double commissionRate,
                              double salesAmount) {
        super(id, name,gender, hireDate);
        this.baseSalary = baseSalary;
        this.commissionRate = commissionRate;
        this.salesAmount = salesAmount;
    }


    // Specific methods for CommissionEmployee
    public double getBaseSalary() {
        return baseSalary;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double getSalesAmount() {
        return salesAmount;
    }


    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }
    public void setSalesAmount(double salesAmount) {
        this.salesAmount = salesAmount;
    }

    public double calculateCommission() {
        return Math.max(salesAmount  * commissionRate, 0);
    }


    @Override
    public double calculateSalary() {
        double commission = salesAmount * commissionRate;
        return baseSalary + commission;
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format(", Type: Commission, Base: $%.2f, Sales: $%.2f, Salary: $%.2f",
                        baseSalary, salesAmount, calculateSalary());
    }
}