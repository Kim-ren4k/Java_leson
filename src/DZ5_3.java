public class DZ5_3 {

    int id;
    String  surname;
    int age;
    int salary;
    String department;

    DZ5_3 (int id2, String surname2, int age2, int salary2, String department2) { // конструктор
        id = id2;    // Присваиваем значения в теле контруктора
        surname = surname2;
        age = age2;
        salary = salary2;
        department = department2;

    }

    double uvelichenieZarplat () {  // метод увеличения ЗП
        salary *= 2;
        return salary; // возвращает salary

    }
}

class EmployeeTest {   // саздаю класс

    public static void main(String[] args) {    // внутри метода main

        DZ5_3 emp1 = new DZ5_3(1, "Kim", 30, 35, "IT"); // объекты
        DZ5_3 emp2 = new DZ5_3(2, "Pak", 25, 30, "HR");

        emp1.uvelichenieZarplat();
        System.out.println("Новая зп: " + emp1.surname + " - " + emp1.salary);

        double newSalary = emp2.uvelichenieZarplat();
        System.out.println("Новая зп: " + emp2.surname + " - " + emp2.salary);

    }

}