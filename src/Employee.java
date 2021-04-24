public class Employee {

    Employee (int id2, String surname2, int age2) { // Контруктор, назывется как и класс
        this (id2, surname2, age2, 0, null); // корректное использование this
//        this (surname2, age2);                      // this должно всегда быть на 1 месте в теле констркутора
//        id = id2;
//        surname = surname2;
//        age = age2;
    }

    Employee (String surname3, int age3) {// Контруктор, назывется как и класс
        this (0, surname3, age3, 0, null);
//       surname = surname3;
//        age = age3;
    }

    Employee (int id4, String  surname4,int age4, int salary4, String department4) {// Контруктор, назывется как и класс
//        this (id4,surname4, age4);
        id = id4;
        surname = surname4;
        age = age4;
        salary = salary4;
        department = department4;
    }

    int id;
    String  surname;
    int age;
    int salary;
    String department;
}

class EmployeeTest1 {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "Kim", 32);
        System.out.println(emp.surname);

        Employee emp2 = new Employee("Ren", 31);
        System.out.println(emp2.department);

        Employee emp3 = new Employee(2,"Jora", 50, 50000, "it");
        System.out.println(emp2.department);


    }
}