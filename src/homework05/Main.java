package homework05;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        do {
            // entering the amount of employees
            System.out.print("Enter the number of employees (at least 5): ");
            n = sc.nextInt();
            if (n < 5) {
                // if user gives too few of them, this message shows up
                System.out.println("There must be at least 5 employees!");
            }
        } while (n < 5); // it goes on until the user enters at least 5 (simple validation)

        // creating an array, where all the employees data will be stored
        Employee[] staff = new Employee[n];
        int i = 0;
        while (i < n) {
            // entering the data
            System.out.print("Enter the employee " + (i + 1) + "'s name: ");
            String name = sc.next();
            System.out.print("Enter the employee " + (i + 1) + "'s age: ");
            int age = sc.nextInt();
            System.out.print("Enter the employee " + (i + 1) + "'s position: ");
            String position = sc.next();
            System.out.print("Enter the employee " + (i + 1) + "'s baseSalary: ");
            double baseSalary = sc.nextDouble();

            // depending on the position, the object with the corresponding name wil be created
            switch (Position.valueOf(position)) {
                case INTERN:
                    staff[i] = new Intern(name, age, baseSalary);
                    i++;
                    break;
                case DEVELOPER:
                    staff[i] = new Developer(name, age, baseSalary);
                    i++;
                    break;
                case SUPERVISOR:
                    staff[i] = new Supervisor(name, age, baseSalary);
                    i++;
                    break;
                case MANAGER:
                    staff[i] = new Manager(name, age, baseSalary);
                    i++;
                    break;
                default:
                    System.out.println("Invalid position!");
            }
        }

        // when the input is done, the user is given a choice of 3 problems
        int option;
        do {
            System.out.println("\n1. Print the total salary");
            System.out.println("2. Find an employee by name");
            System.out.println("3. Print the highest earner");
            System.out.println("\nChoose an option: ");
            option = sc.nextInt();
        } while (option < 1 || option > 3);
        switch (option) {
            case 1:
                double totalSalary = 0;
                for (Employee emp : staff) {
                    totalSalary += emp.computeSalary();
                }
                System.out.print("The total salary is: " + totalSalary);
                break;
            case 2:
                System.out.print("Enter the employee's name: ");
                String name = sc.next();
                Boolean found = false;
                for (Employee emp : staff) {
                    if (emp.getName().equals(name)) {
                        found = true;
                        System.out.println("The employee " + name + " found successfully");
                        System.out.println(emp.computeSalary());
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Employee not found!");
                }
                break;
            case 3:
                double maxSalary = 0;
                Employee highestEarner = null;
                for (Employee emp : staff) {
                    if (emp.computeSalary() > maxSalary) {
                        maxSalary = emp.computeSalary();
                        highestEarner = emp;
                    }
                }
                System.out.print("The highest earner's name is: " + highestEarner.getName());
        }
    }
}
