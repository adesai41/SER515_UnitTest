package hacs;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class FacadeTest {

    Facade facade = new Facade();
    ClassCourseList classCourseList = new ClassCourseList();

    @Test
    void CreateCourseListTest() throws IOException {
        //test for CreateCourseListTest method
        System.out.println("Aakanksha Desai ========== TEST TWENTY FOUR EXECUTED ============");
        //display size of course list which 5 as there are 5 courses in Courses.txt
        int expected = 5;
        facade.createCourseList();
        System.out.println(facade.theCourseList);
        assertEquals(expected, facade.theCourseList.size());
    }

    @Test
    void attachCourseToUserTest() throws IOException {
        //test for attachCourseToUserTest method
        System.out.println("Aakanksha Desai ========== TEST TWENTY FIVE EXECUTED ============");
        //checks for how many courses are attached to a user
        //here in UserCourse.txt file there are 3 courses related to the user Aakanksha
        int expected = 3;
        UserInfoItem userInfoItem = new UserInfoItem();
        userInfoItem.userType = UserInfoItem.USER_TYPE.Student;
        userInfoItem.strUserName = "Aakanksha";
        facade.createUser(userInfoItem);
        facade.createCourseList();
        facade.attachCourseToUser();
        assertEquals(expected, facade.thePerson.getCourseList().size());
    }

    @Test
    void SubmitSolutionTest() {
        //test for SubmitSolutionTest method
        System.out.println("Aakanksha Desai ========== TEST TWENTY SIX EXECUTED ============");
        int expected = 1;
        Assignment theAssignment = new Assignment();
        Solution theSolution = new Solution();
        facade.submitSolution(theAssignment, theSolution);
        assertEquals(expected, theAssignment.getTheSolutionList().size());
    }

    @Test
    void CreateUserTest() {
        //test for CreateUserTest method
        System.out.println("Aakanksha Desai ========== TEST TWENTY SEVEN EXECUTED ============");
        UserInfoItem userInfoItem = new UserInfoItem();
        userInfoItem.userType = UserInfoItem.USER_TYPE.Student;
        facade.createUser(userInfoItem);
        assertTrue(facade.thePerson instanceof Student);
    }
}