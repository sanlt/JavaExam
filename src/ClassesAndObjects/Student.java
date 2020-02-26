package ClassesAndObjects;

public class Student {
    String name;
    String lastName;
    int age;
    static int studentCounter = 0;

    public Student(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        studentCounter++;
    }

    public Student(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        studentCounter++;
    }

    public void printStudentInfo() {
        System.out.println(name + " " + lastName + " is " + age + " years old");
        System.out.println(getCounter());
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getCounter(){
     return studentCounter;
    }
}
