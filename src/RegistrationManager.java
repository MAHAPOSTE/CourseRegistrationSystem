import java.util.ArrayList;
import java.util.List;

public class RegistrationManager {
    private List<Course> courseList;

    public RegistrationManager() {
        courseList = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courseList.add(course);
    }

    public List<Course> getAllCourses() {
        return courseList;
    }
}