package academia;

public class PrintStudents {
    public static void main(String[] args) {
        Student s1 = new Student(999, "Bill", 4.0);
        Student s2 = new Student();

        System.out.println(s1);
        System.out.println(s2);
    }
}
