package homework05;

public class Employee extends Person {
    private double baseSalary;
    Position pos;

    public Employee(String name, int age, Position pos, double baseSalary) {
        super(name, age);
        this.baseSalary = baseSalary;
        this.pos = pos;
    }

    public double computeSalary(){
        return baseSalary;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Position: " + pos + ", Salary: " + baseSalary;
    }
}

class Intern extends Employee {

    Intern(String name, int age, double baseSalary) {
        super(name, age, Position.INTERN, baseSalary);
    }

    @Override
    public double computeSalary() {
        return super.computeSalary();
    }
}

class Developer extends Employee {

    Developer(String name, int age, double baseSalary) {
        super(name, age, Position.DEVELOPER, baseSalary);
    }

    @Override
    public double computeSalary() {
        return super.computeSalary() * 1.1;
    }
}

class Supervisor extends Employee {

    Supervisor(String name, int age, double baseSalary) {
        super(name, age, Position.SUPERVISOR, baseSalary);
    }

    @Override
    public double computeSalary() {
        return super.computeSalary() * 1.15;
    }
}

class Manager extends Employee {

    Manager(String name, int age, double baseSalary) {
        super(name, age, Position.MANAGER, baseSalary);
    }

    @Override
    public double computeSalary() {
        return super.computeSalary() * 1.25;
    }
}