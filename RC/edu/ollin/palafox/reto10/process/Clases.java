package edu.ollin.palafox.reto10.process;
import java.util.ArrayList;
/*
El código define una serie de clases y una interfaz que representan roles de empleados y sus responsabilidades en una empresa.
Incluye la clase abstracta "Employee" y sus subclases "CEO", "Manager", "HR", "SrEngineer", "JrEngineer",
y las clases que implementan la interfaz "Interviewer" y "Programmer".
También incluye una clase "EmployeeManager" que maneja una lista de empleados y métodos para agregar, eliminar y listar empleados.
 */
public class Clases {
    public class CEO {
        private String name;
        private int age;
        private double salary;

        public CEO(String name, int age, double salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        public void lead() {
            System.out.println("I am the CEO and I am leading the company!");
        }
    }

    public class Manager extends Employee {
        private int teamSize;

        public Manager(String name, int age, double salary, int teamSize) {
            super(name, age, salary);
            this.teamSize = teamSize;
        }

        @Override
        public void work() {
            System.out.println("I am a manager and I am delegating tasks to my team.");
        }
    }

    public abstract static class Employee {
        private String name;
        private int age;
        private double salary;
        private int id;

        public Employee(String name, int age, double salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        public abstract void work();


        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }
    public class EmployeeManager {

        private static ArrayList<Employee> employees = new ArrayList<Employee>();

        public static boolean addEmployee(Employee employee) {
            employees.add(employee);
            return true;
        }

        public static boolean removeEmployee(int id) {
            for (Employee employee : employees) {
                if (employee.getId() == id) {
                    employees.remove(employee);
                    return true;
                }
            }
            return false;
        }

        public static Employee[] listEmployees() {
            Employee[] employeesArray = new Employee[employees.size()];
            employees.toArray(employeesArray);
            return employeesArray;
        }

    }

    public class HR extends Employee {
        private String specialization;

        public HR(String name, int age, double salary, String specialization) {
            super(name, age, salary);
            this.specialization = specialization;
        }

        @Override
        public void work() {
            System.out.println("I am an HR and I am hiring employees.");
        }

        public void interview(Interviewer interviewer) {
            interviewer.interview();
        }
    }

    public interface Interviewer {
        void interview();
    }

    public class SrEngineer extends Employee implements Interviewer {
        private String technology;

        public SrEngineer(String name, int age, double salary, String technology) {
            super(name, age, salary);
            this.technology = technology;
        }

        @Override
        public void work() {
            System.out.println("I am a senior engineer and I am designing systems.");
        }

        @Override
        public void interview() {
            System.out.println("I am a senior engineer and I am interviewing candidates for engineering positions.");
        }
    }

    public class JrEngineer extends Employee {
        private SrEngineer mentor;

        public JrEngineer(String name, int age, double salary, SrEngineer mentor) {
            super(name, age, salary);
            this.mentor = mentor;
        }

        @Override
        public void work() {
            System.out.println("I am a junior engineer and I am implementing features under the guidance of my mentor.");
        }
    }

    public interface Programmer {
        void code();
    }

    public class BackendProgrammer implements Programmer {
        @Override
        public void code() {
            System.out.println("I am a backend programmer and I am coding server-side functionality.");
        }
    }

    public class FrontendProgrammer implements Programmer {
        @Override
        public void code() {
            System.out.println("I am a frontend programmer and I am coding client-side functionality.");
        }
    }

}
