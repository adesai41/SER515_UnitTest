package hacs;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class CourseIteratorTest {

    CourseIterator courseIterator = new CourseIterator();
    ClassCourseList classCourseList=new ClassCourseList();

    @Test
    void nextTest() throws IOException {
        //test for nextTest method
        System.out.println("Aakanksha Desai ========== TEST FOURTEEN EXECUTED ============");
        //creates course iterator without any courses defined
        classCourseList.InitializeFromFile("/Users/aakankshadesai/Downloads/hacs/hacs/Courses.txt");
        CourseIterator obj = new CourseIterator(classCourseList);
        //test case to check for valid course
        assertEquals(new Course("SER594", 0).toString(), ((Course) obj.next("SER594")).toString());
        //test case to check if exception throws for invalid course name
        assertEquals(null, obj.next("xyz"));
    }

    @Test
    void IndexedNextTest() throws IOException {
        //test for IndexedNextTest method
        System.out.println("Aakanksha Desai ========== TEST FIFTEEN EXECUTED ============");
        //creates course iterator without any courses defined
        classCourseList.InitializeFromFile("/Users/aakankshadesai/Downloads/hacs/hacs/Courses.txt");
        CourseIterator obj = new CourseIterator(classCourseList);
        //test case to check for valid course
        assertEquals(new Course("SER515",0).toString() ,((Course)obj.next()).toString());
        assertEquals(new Course("SER594",0).toString() ,((Course)obj.next()).toString());
        assertEquals(new Course("SER501",0).toString() ,((Course)obj.next()).toString());
        assertEquals(new Course("SER531",0).toString() ,((Course)obj.next()).toString());
        assertEquals(new Course("SER563",0).toString() ,((Course)obj.next()).toString());
        //test case to check if exception throws for invalid course name
        assertEquals(null, obj.next());
    }

    @Test
    void removeTest() throws IOException {
        //test for removeTest method
        System.out.println("Aakanksha Desai ========== TEST SIXTEEN EXECUTED ============");
        //creates course iterator without any courses defined
        classCourseList.InitializeFromFile("/Users/aakankshadesai/Downloads/hacs/hacs/Courses.txt");
        CourseIterator obj = new CourseIterator(classCourseList);
        //test case to check for remove
        obj.next(); // current course is SER515
        obj.remove();
        assertEquals(null, ((Course) obj.next("SER515")));

    }

    @Test
    void hasNextTest() {
        //test for hasNextTest method
        System.out.println("Aakanksha Desai ========== TEST SEVENTEEN EXECUTED ============");
        Course course = new Course("SER515", 1);
        classCourseList.add(course);
        CourseIterator courseIterator = new CourseIterator(classCourseList);
        assertTrue(courseIterator.hasNext());
    }

    @Test
    void CourseIteratorClassCourseListTest() {
        System.out.println("Aakanksha Desai ========== TEST EIGHTEEN EXECUTED ============");
        int expected = 1;
        Course course = new Course("SER515", 1);
        classCourseList.add(course);
        courseIterator = new CourseIterator(classCourseList);
        assertEquals(expected, courseIterator.getTheCourseList().size());
    }
}