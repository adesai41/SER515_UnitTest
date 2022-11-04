package hacs;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ListIteratorTest {

    ListIterator listIterator = new ListIterator();

    @Test
    void ListIteratorArrayListOfObjectTest() {
        //test for ListIteratorArrayListOfObject method
        System.out.println("Aakanksha Desai ========== TEST THIRTY ONE EXECUTED ============");
        int expected = 2;
        ArrayList<Object> testList = new ArrayList<>();
        testList.add(3);
        testList.add(3);
        ListIterator listIterator = new ListIterator(testList);
        assertEquals(expected, listIterator.getTheList().size());
    }

    @Test
    void HasNextTest() {
        //test for HasNext method
        System.out.println("Aakanksha Desai ========== TEST THIRTY TWO EXECUTED ============");
        ArrayList<Object> testList = new ArrayList<>();
        testList.add(1);
        ListIterator listIterator = new ListIterator(testList);
        assertTrue(listIterator.hasNext());
    }

    @Test
    void NextTest() {
        //test for Next method
        System.out.println("Aakanksha Desai ========== TEST THIRTY THREE EXECUTED ============");
        ArrayList<Object> testList = new ArrayList<>();
        testList.add(1);
        ListIterator listIterator = new ListIterator(testList);
        assertNotNull(listIterator.next());
    }

    @Test
    void RemoveTest() {
        //test for Remove method
        System.out.println("Aakanksha Desai ========== TEST THIRTY FOUR EXECUTED ============");
        int expected = 0;
        ArrayList<Object> testList = new ArrayList<>();
        testList.add(1);
        ListIterator listIterator = new ListIterator(testList);
        listIterator.next();
        listIterator.remove();
        assertEquals(expected, listIterator.getTheList().size());
    }

}