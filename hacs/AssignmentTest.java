package hacs;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.DateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;


class AssignmentTest {
    Assignment assignment = new Assignment();
    Solution solution = new Solution();

    @Test
    void SetDueDateTest() {
        //test for setduedate method
        System.out.println("Aakanksha Desai ========== TEST ONE EXECUTED ============");
        Date dueDate = new Date();
        assignment.setDueDate(dueDate);
        assertEquals(dueDate, assignment.getDueDate());
    }

    @Test
    void SetAssSpecificationTest() {
        //test for SetAssSpecificationTest method
        System.out.println("Aakanksha Desai ========== TEST TWO EXECUTED ============");
        String input = "Specification for assignment will be types here";
        assignment.setAssignmentSpecification(input);
        assertEquals(input, assignment.getAssignmentSpecification());
    }

    @Test
    void IsOverDueTest() {
        //test for IsOverDueTest method
        System.out.println("Aakanksha Desai ========== TEST THREE EXECUTED ============");
        assertEquals(true, assignment.isOverDue());
    }

    @Test
    void AddSolutionTest() {
        //test for AddSolutionTest method
        System.out.println("Aakanksha Desai ========== TEST FOUR EXECUTED ============");
        int test = 1;
        assignment.addSolution(solution);
        assertEquals(test, assignment.getTheSolutionList().size());
    }

    @Test
    void SubmitSolutionTest() {
        //test for SubmitSolutionTest method
        System.out.println("Aakanksha Desai ========== TEST FIVE EXECUTED ============");
        assignment.submitSolution();
    }

    @Test
    void GetSolutionTest() {
        //test for GetSolutionTest method
        System.out.println("Aakanksha Desai ========== TEST SIX EXECUTED ============");
        solution.setTheAuthor("Assignment Solution");
        assignment.addSolution(solution);
        assertEquals("Assignment Solution", assignment.getSolution("Assignment Solution").getTheAuthor());

    }

    @Test
    void GetSuggestSolutiontest() {
        //test for GetSuggestSolutiontest method
        System.out.println("Aakanksha Desai ========== TEST SEVEN EXECUTED ============");
        assertTrue(assignment.getSuggestSolution() instanceof Solution);
    }

    @Test
    void GetSolutionIteratorTest() {
        //test for GetSolutionIteratorTest method
        System.out.println("Aakanksha Desai ========== TEST EIGHT EXECUTED ============");
        int expected = 0;
        SolutionIterator solutionIterator = assignment.getSolutionIterator();
        assertEquals(expected, solutionIterator.solutionlist.size());
    }

    @Test
    void ToStringTest() {
        //test for ToStringTest method
        System.out.println("Aakanksha Desai ========== TEST NINE EXECUTED ============");
        String input = "Assignment One";
        assignment.setAssignmentName(input);
        assertEquals(input, assignment.toString());
    }

    @Test
    void GetDueDateStringTest() {
        //test for GetDueDateStringTest method
        System.out.println("Aakanksha Desai ========== TEST TEN EXECUTED ============");
        Date dueDate = new Date();
        assignment.setDueDate(dueDate);
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        assertEquals(dateFormat.format(dueDate), assignment.getDueDateString());

    }

    @Test
    void AcceptTest() {
        //test for AcceptTest method
        System.out.println("Aakanksha Desai ========== TEST ELEVEN EXECUTED ============");
        assignment.accept(new ReminderVisitor(new Reminder()));
        assertTrue(assignment.isAccepted());
    }
}