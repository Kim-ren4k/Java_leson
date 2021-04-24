public class Student {
    int id;
    String name;
    String surname;
    int year_of_study;
    double maht;
    double geo;
    double foreign_language;


}

class StudentTest {

    double sredArifmOcenka(Student S) {
        double sredOcenka = (S.foreign_language + S.geo + S.maht) / 3;
        System.out.println("Средняя оценка: " + S.name + " " + sredOcenka);
        return sredOcenka;
    }

    public static void main (String [] args){

        Student S1 = new Student();
        S1.id=1;
        S1.name="Ren";
        S1.surname="Kim";
        S1.year_of_study=2021;
        S1.maht=5;
        S1.geo=5;
        S1.foreign_language=4.8;

        Student S2 = new Student();
        S2.id=2;
        S2.name="Ira";
        S2.surname="Pak";
        S2.year_of_study=2021;
        S2.maht=4.2;
        S2.geo=4.9;
        S2.foreign_language=4.9;

        Student S3 = new Student();
        S3.id=3;
        S3.name="Alex";
        S3.surname="Son";
        S3.year_of_study=2021;
        S3.maht=4.7;
        S3.geo=4.4;
        S3.foreign_language=4.2;

//        System.out.println(S1.name + " " + S1.surname + " avirage rating: " + (S1.maht + S1.geo + S1.foreign_language)/3);
//        System.out.println(S2.name + " " + S2.surname + " avirage rating: " + (S2.maht + S2.geo + S2.foreign_language)/3);
//        System.out.println(S3.name + " " + S3.surname + " avirage rating: " + (S3.maht + S3.geo + S3.foreign_language)/3);

        StudentTest sTest = new StudentTest();
        sTest.sredArifmOcenka(S1);
        sTest.sredArifmOcenka(S2);
        sTest.sredArifmOcenka(S3);


    }


}
