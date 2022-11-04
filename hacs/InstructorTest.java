package hacs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstructorTest {

    Instructor instructor = new Instructor();

    @Test
    void CreateCourseMenuTest() {
        //test for CreateCourseMenu method
        System.out.println("Aakanksha Desai ========== TEST TWENTY NINE EXECUTED ============");
        CourseMenu courseMenu = instructor.createCourseMenu(new Course("SER515", 0), 0);
        assertTrue(courseMenu instanceof HighLevelCourseMenu);
    }

    @Test
    void InstructorTest() {
        //test for Instructor method
        System.out.println("Aakanksha Desai ========== TEST THIRTY EXECUTED ============");
        int expected = 1;
        assertEquals(expected, instructor.type);
    }
}