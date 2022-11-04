package hacs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void ToStringTest() {
        //test for ToString method
        System.out.println("Aakanksha Desai ========== TEST FORTY FOUR EXECUTED ============");
        //test to see if author string gets attached to the previous due date strings
        solution.setTheAuthor("MJ FINDLER");
        solution.setSolutionFileName("Solution");
        assertEquals("MJ FINDLER  Solution Grade =0  not reported", solution.toString());
    }

    @Test
    void GetGradeStringTest() {
        //test for GetGradeString method
        System.out.println("Aakanksha Desai ========== TEST FORTY FIVE EXECUTED ============");
        String expected = "-1";
        assertEquals(expected, solution.getGradeString());
    }

    @Test
    void GetGradeIntTest() {
        //test for GetGradeInt method
        System.out.println("Aakanksha Desai ========== TEST FORTY SIX EXECUTED ============");
        int expected = 0;
        assertEquals(expected, solution.getGradeInt());
    }

    @Test
    void SetReportedTest() {
        //test for SetReported method
        System.out.println("Aakanksha Desai ========== TEST FORTY SEVEN EXECUTED ============");
        solution.setReported(true);
        assertTrue(solution.isReported());
    }

    @Test
    void IsReportedTest() {
        //test for IsReported method
        System.out.println("Aakanksha Desai ========== TEST FORTY EIGHT EXECUTED ============");
        solution.setReported(true);
        assertTrue(solution.isReported());
    }
}