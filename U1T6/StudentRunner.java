public class StudentRunner {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 16, 3.8);
        student1.introduce();
        student1.printStudentInfo();

        Student student2 = new Student("Bob", 20, 3.5);
        student2.introduce();
        student2.printStudentInfo();
    }
}
