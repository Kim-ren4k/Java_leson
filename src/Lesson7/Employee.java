package Lesson7;

public class Employee {
    public double salary;

    public void dvoinayaZP () {   // метод
        System.out.println("Новая зарплата: = " + salary * 2);

    }

    public Employee (double salary2) { // конструктор
        salary = salary2;
    }

    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.dvoinayaZP();
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee(600);
        System.out.println(emp.salary);
        emp.dvoinayaZP();
    }
}