package classes;
import java.time.LocalDate;

// Base abstract class
public abstract class Employee {
    private int id;
    private String name;
    private Gender gender;
    private LocalDate hireDate;

    // Constructor
    public Employee(int id, String name,Gender gender, LocalDate hireDate) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.hireDate = hireDate;
    }

    // Abstract method - must be implemented by subclasses
    public abstract double calculateSalary();

    public void setGender(Gender gender) {
        this.gender = gender;
    }
    public Gender getGender() {
        return gender;
    }
    // Concrete methods
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public int getYearsOfService() {
        return LocalDate.now().getYear() - hireDate.getYear();
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Name: %s, Gender : %s Hire Date: %s, Years of Service: %d",
                id, name,gender, hireDate, getYearsOfService());
    }
}
