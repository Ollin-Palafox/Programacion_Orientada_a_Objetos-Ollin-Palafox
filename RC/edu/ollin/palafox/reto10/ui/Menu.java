package edu.ollin.palafox.reto10.ui;
import java.util.Scanner;
import edu.ollin.palafox.reto10.process.Clases;
/*
La clase "Menu" es una clase que tiene métodos estáticos para interactuar con un sistema de gestión de empleados.
El método "CLI" muestra un menú en la consola y lee la entrada del usuario para realizar diferentes acciones.
El método "addEmployee" permite agregar un nuevo empleado al sistema, solicitando información del usuario.
El método "removeEmployee" permite eliminar un empleado del sistema, solicitando el ID del empleado al usuario.
El método "listEmployees" permite listar todos los empleados en el sistema. Cada uno de estos métodos llama a otros métodos de la clase "EmployeeManager" para realizar las acciones correspondientes en el sistema.
 */
public class Menu {

    public static void CLI() {
        Scanner scanner = new Scanner(System.in);
        String option;

        do {
            System.out.println("\n*** EMPLOYEE MANAGEMENT SYSTEM ***");
            System.out.println("Choose an option:");
            System.out.println("1. Add new employee");
            System.out.println("2. Remove employee");
            System.out.println("3. List all employees");
            System.out.println("4. Exit");

            option = scanner.nextLine();

            switch (option) {
                case "1":
                    addEmployee();
                    break;
                case "2":
                    removeEmployee();
                    break;
                case "3":
                    listEmployees();
                    break;
                case "4":
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }

        } while (!option.equals("4"));
    }

    private static void addEmployee() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n*** ADD EMPLOYEE ***");

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter employee salary: ");
        double salary = Double.parseDouble(scanner.nextLine());

        Clases.Employee employee = new Clases.Employee(name, age, salary) {
            @Override
            public void work() {

            }
        };
        boolean added = Clases.EmployeeManager.addEmployee(employee);

        if (added) {
            System.out.println("Employee added successfully: " + employee.toString());
        } else {
            System.out.println("Employee not added. Please try again.");
        }
    }


    private static void removeEmployee() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n*** REMOVE EMPLOYEE ***");

        System.out.print("Enter employee ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        // Call the removeEmployee() method from the EmployeeManager class
        boolean removed = Clases.EmployeeManager.removeEmployee(id);

        if (removed) {
            System.out.println("Employee removed successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    private static void listEmployees() {
        System.out.println("\n*** LIST EMPLOYEES ***");

        // Call the listEmployees() method from the EmployeeManager class
        Clases.Employee[] employees = Clases.EmployeeManager.listEmployees();

        if (employees.length == 0) {
            System.out.println("No employees found.");
        } else {
            for (Clases.Employee employee : employees) {
                System.out.println(employee.toString());
            }
        }
    }
}
