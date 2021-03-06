import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CoursesTest {
    @Test
    @DisplayName("Add a Course to School")
    void addCourseTest() {
        Courses courses = new Courses();
        courses.addCourse("ECE111");
        int expected = 1;
        int actual = courses.getSize();
        assertEquals(expected, actual, "The method should add a course");
    }

    @Test
    @DisplayName("If School offers Course")
    void isCourseAvailableTest() {
        Courses courses = new Courses();
        courses.addCourse("ECE111");
        assertTrue(courses.isCourseAvailable("ECE111"));
    }
}
