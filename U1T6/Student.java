public class Student {
    private String name;
    private int age;
    private double gpa;

    public Student(String studentName, int studentAge, double studentGpa) {
        name = studentName;
        age = studentAge;
        gpa = studentGpa;
    }

    public void introduce() {
        if (age < 18) {
            System.out.println("Hello my name is " + name + " and I am a younger student!");
        } else {
            System.out.println("Hello my name is " + name + " and I am an older student!");
        }
    }

    public void printStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }


















}
