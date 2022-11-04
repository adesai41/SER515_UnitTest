package hacs;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ClassCourseListTest {

    ClassCourseList classCourseList = new ClassCourseList();

    @Test
    void initializeFromFileTest() {
        //test for initializeFromFileTest method
        System.out.println("Aakanksha Desai ========== TEST TWELVE EXECUTED ============");
        //test case to check if exception throws
        assertThrows(IOException.class, () -> {
            classCourseList.InitializeFromFile("la");
        });
    }

    @Test
    void FindCourseByCourseNameTest() throws IOException {
        //test for FindCourseByCourseNameTest method
        System.out.println("Aakanksha Desai ========== TEST THIRTEEN EXECUTED ============");
        //check if SER594 is there in the course list or not
        String courseName = "SER594";
        classCourseList.InitializeFromFile("/Users/aakankshadesai/Downloads/hacs/hacs/Courses.txt");
        assertEquals(courseName, classCourseList.FindCourseByCourseName(courseName).toString());
    }

}