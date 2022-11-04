package hacs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionIteratorTest {

    SolutionList solutionList = new SolutionList();
    Solution solution = new Solution();

    @Test
    void SolutionIteratorTest() {
        //test for SolutionIterator method
        System.out.println("Aakanksha Desai ========== TEST THIRTY FIVE EXECUTED ============");
        new SolutionIterator();
    }

    @Test
    void SolutionIteratorSolutionListTest() {
        //test for SolutionIteratorSolutionList method
        System.out.println("Aakanksha Desai ========== TEST THIRTY SIX EXECUTED ============");
        solutionList.add(solution);
        SolutionIterator solutionIterator = new SolutionIterator(solutionList);
        assertTrue(solutionIterator.hasNext());
    }

    @Test
    void MoveToHeadTest() {
        //test for MoveToHead method
        System.out.println("Aakanksha Desai ========== TEST THIRTY SEVEN EXECUTED ============");
        int expected = -1;
        solutionList.add(solution);
        SolutionIterator solutionIterator = new SolutionIterator(solutionList);
        solutionIterator.moveToHead();
        assertEquals(expected, solutionIterator.getCurrentSolutionNumber());
    }

    @Test
    void HasNextTest() {
        //test for HasNext method
        System.out.println("Aakanksha Desai ========== TEST THIRTY EIGHT EXECUTED ============");
        solutionList.add(solution);
        SolutionIterator solutionIterator = new SolutionIterator(solutionList);
        assertTrue(solutionIterator.hasNext());
    }

    @Test
    void NextTest() {
        //test for Next method
        System.out.println("Aakanksha Desai ========== TEST THIRTY NINE EXECUTED ============");
        solutionList.add(solution);
        SolutionIterator solutionIterator = new SolutionIterator(solutionList);
        assertNotNull(solutionIterator.next());
    }
    @Test
    void NextStringTest() {
        //test for NextString method
        System.out.println("Aakanksha Desai ========== TEST FORTY EXECUTED ============");
        solution.setTheAuthor("MJ FINDLER");
        solutionList.add(solution);
        SolutionIterator solutionIterator = new SolutionIterator(solutionList);
        assertNotNull(solutionIterator.next("MJ FINDLER"));
    }

    @Test
    void RemoveTest() {
        //test for Remove method
        System.out.println("Aakanksha Desai ========== TEST FORTY ONE EXECUTED ============");
        int expected = 0;
        solutionList.add(solution);
        SolutionIterator solutionIterator = new SolutionIterator(solutionList);
        solutionIterator.next();
        solutionIterator.remove();
        assertEquals(expected, solutionIterator.solutionlist.size());
    }
}