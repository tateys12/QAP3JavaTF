public class Demo {
     public static void main(String[] args) {
        // Create instances of the classes
        Person person = new Person("John Doe", 30, "Male");
        Student student = new Student("Jane Smith", 20, "Female", "12345", 3.8);
        Teacher teacher = new Teacher("Mr. Johnson", 40, "Male", "Math", 50000.0);
        CollegeStudent collegeStudent = new CollegeStudent("Alice Johnson", 22, "Female", "67890", 3.5, "Computer Science", 2);

        // Call toString() method for each class
        System.out.println("Person: " + person.toString());
        System.out.println("Student: " + student.toString());
        System.out.println("Teacher: " + teacher.toString());
        System.out.println("College Student: " + collegeStudent.toString());
    }
}
