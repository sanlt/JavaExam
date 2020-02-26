package ClassesAndObjects;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("Mauro", "Palese", 23);
        Student student2 = new Student("Alessia", "Renga");

        student2.setAge(22);

        student.printStudentInfo();
        student2.printStudentInfo();


    }
}
