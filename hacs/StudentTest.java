package hacs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student student = new Student();

    @Test
    void StudentTest() {
        //test for Student method
        System.out.println("Aakanksha Desai ========== TEST FORTY NINE EXECUTED ============");
        int expected = 0;
        assertEquals(expected, student.type);
    }

    @Test
    void CreateCourseMenuTest() {
        //test for CreateCourseMenu method
        System.out.println("Aakanksha Desai ========== TEST FIFTY EXECUTED ============");
        CourseMenu courseMenu = student.createCourseMenu(new Course("SER515", 0), 0);
        assertTrue(courseMenu instanceof HighLevelCourseMenu);
    }

}