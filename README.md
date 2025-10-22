# Payroll-OOP-Java-Assignment
## 📚 Project Overview
This Java application demonstrates core Object-Oriented Programming principles through a comprehensive employee payroll management system. The project implements a class hierarchy for different types of employees and departments, showcasing inheritance, polymorphism, and encapsulation.

## 🏗️ Class Structure

### Core Classes:
- **Employee** (Abstract Superclass)
  - **HourlyEmployee** (Subclass)
  - **MonthlyEmployee** (Subclass)
  - **CommissionEmployee** (Subclass)

### Management Classes:
- **Department** (Composition with Employee list)
- **Manager** (Specialized employee role)

## 🔧 OOP Concepts Demonstrated

### 1. Inheritance
- `Employee` serves as the base class
- Subclasses inherit common properties and override specific behaviors

### 2. Polymorphism
- Different salary calculation methods for each employee type
- Runtime method binding for employee operations

### 3. Encapsulation
- Private fields with public getters/setters
- Controlled access to class properties

### 4. Abstraction
- Abstract methods in base class
- Implementation details hidden in subclasses
  
## 🗂️ Package Structure

### `classes` Package
Contains the core foundational classes:
- **Employee** (Abstract Superclass) - Base class with common employee properties
- **Department** - Manages collections of employees and department operations

### `subClasses` Package
Contains specialized employee implementations:
- **HourlyEmployee** - Employees paid based on hourly rates and hours worked
- **MonthlyEmployee** - Employees with fixed monthly salaries
- **CommissionEmployee** - Employees earning based on sales commission
  
## 📁 Project Structure
src/
├── classes/
│ ├── Employee.java (Abstract)
│ └── Department.java
└── subClasses/
├── HourlyEmployee.java
├── MonthlyEmployee.java
└── CommissionEmployee.java


## 🔧 OOP Concepts Demonstrated

### 1. Package Organization
- Logical separation of concerns
- Clear distinction between base and specialized classes
- Improved code maintainability

### 2. Inheritance & Polymorphism
- `Employee` abstract class defines common interface
- Subclasses implement specific salary calculations
- Runtime polymorphism through method overriding

### 3. Encapsulation
- Protected fields in superclass
- Controlled access through getters/setters
- Implementation hiding in subclasses

## 🎯 Learning Objectives

### Package Management
- Understand Java package organization
- Learn proper import statements
- Practice access modifier usage (public, protected, private)

### Class Design
- Implement inheritance hierarchies across packages
- Design abstract classes and concrete implementations
- Create cohesive class relationships

### OOP Principles
- Apply polymorphism in distributed packages
- Practice encapsulation with proper access control
- Understand composition vs inheritance
- Abstraction 

## 💻 Technical Features
- **Extensible Architecture**: Easy to add new employee types
- **Type Safety**: Compile-time checking across packages
- **Maintainable Code**: Organized structure for easy navigation and updates

## 🚀 Getting Started
1. Clone the repository
2. Navigate through the package structure
3. Study the class relationships between packages
4. Examine how subclasses extend the base Employee class
5. Run the demonstration to see polymorphism in action


## 📝 Assignment Context
Perfect for teaching:
- Package creation and management
- Cross-package class relationships
- Import statements and access control
- Real-world Java project structure
