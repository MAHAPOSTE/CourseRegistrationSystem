
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RegistrationManager manager = new RegistrationManager();

        // Adding some sample courses
        manager.addCourse(new Course("C101", "Java Programming"));
        manager.addCourse(new Course("C102", "Web Development"));
        manager.addCourse(new Course("C103", "Database Systems"));

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student ID: ");
        String studentId = sc.nextLine();

        System.out.print("Enter student name: ");
        String studentName = sc.nextLine();

        Student student = new Student(studentId, studentName);

        System.out.println("\nAvailable Courses:");
        for (Course course : manager.getAllCourses()) {
            System.out.println(course);
        }

        System.out.print("\nEnter course ID to register: ");
        String courseId = sc.nextLine();

        Course selectedCourse = null;
        for (Course course : manager.getAllCourses()) {
            if (course.getCourseId().equalsIgnoreCase(courseId)) {
                selectedCourse = course;
                break;
            }
        }

        if (selectedCourse != null) {
            student.registerCourse(selectedCourse);
            System.out.println("\n✅ Course registered successfully!");
        } else {
            System.out.println("\n❌ Invalid course ID.");
        }

        // Show registered courses
        System.out.println("\nRegistered Courses for " + student.getStudentName() + ":");
        for (Course c : student.getRegisteredCourses()) {
            System.out.println("• " + c);
        }

        sc.close();
    }
}