import java.util.*;

public class Task3 {

    static class Student {
        String firstName;
        String lastName;
        String group;
        double averageMark;

        int getScholarship() {
            if (this.averageMark == 5) {
                return 100;
            } else {
                return 80;
            }
        }

        Student() {
        }

        Student(String firstName, String lastName, String group, double averageMark) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.group = group;
            this.averageMark = averageMark;
        }
    }

    static class Aspirant extends Student {
        boolean science_work;

        int getScholarship() {
            if (super.averageMark == 5) {
                return 200;
            } else {
                return 180;
            }
        }

        Aspirant(String firstName, String lastName, String group, double averageMark, boolean science_work) {
            super(firstName, lastName, group, averageMark);
            this.science_work = science_work;
        }
    }

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<Student>();

        Aspirant aspirant1 = new Aspirant("Tom", "Reddle", "slizerine", 5, true);
        Aspirant aspirant2 = new Aspirant("Germiona", "Greindger", "griffindor", 5, true);
        Student student1 = new Student("Ron", "Yizli", "griffindor", 4.5);
        Student student2 = new Aspirant("Garry", "Potter", "griffindor", 4, true);
        Student student3 = new Student("Drako", "Malfoi", "griffindor", 5);

        students.add(aspirant1);
        students.add(student1);
        students.add(student2);
        students.add(aspirant2);
        students.add(student3);

        for (Student i : students) {
            System.out.println(i.getScholarship());
        }

    }
}
