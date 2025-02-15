import JunitTestingPrograms.TestingListOperations;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestListOperations {
    @Test
    public void testAdd() {
        List<Integer> list = new ArrayList<>();
        TestingListOperations.addElementToList(list, 10);
        assertTrue(list.contains(10));
    }
    @Test
    public void testRemove() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        boolean removed = list.remove(Integer.valueOf(3)); // Element not present
        assertFalse(removed);
    }
    @Test
    public void testsize(){
        List<Integer> list = new ArrayList<>();
       list.add(10);
       list.add(20);
       TestingListOperations.sizeOfList(list);
       assertEquals(2,list.size());
    }

}
