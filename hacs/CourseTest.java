package hacs;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    String strCourse = "SER515";
    int theLevel = 0;
    Course course = new Course(strCourse, theLevel);
    Assignment assignment = new Assignment();

    @Test
    void addAssignmentTest() throws NullPointerException {
        //test for addAssignmentTest method
        System.out.println("Aakanksha Desai ========== TEST NINETEEN EXECUTED ============");
        int expected = 1;
        course.addAssignment(assignment);
        assertEquals(expected, course.assignmentList.size());
    }

    @Test
    void CourseTest() {
        //test for CourseTest method
        System.out.println("Aakanksha Desai ========== TEST TWENTY EXECUTED ============");
        assertEquals(strCourse, course.toString());
        assertEquals(theLevel, course.getCourseLevel());
    }

    @Test
    void ToStringTest() {
        //test for ToStringTest method
        System.out.println("Aakanksha Desai ========== TEST TWENTY ONE EXECUTED ============");
        assertEquals(strCourse, course.toString());
    }

    @Test
    void AcceptTest() {
        //test for AcceptTest method
        System.out.println("Aakanksha Desai ========== TEST TWENTY TWO EXECUTED ============");
        course.accept(new ReminderVisitor());
        assertTrue(course.isAccepted());
    }
}