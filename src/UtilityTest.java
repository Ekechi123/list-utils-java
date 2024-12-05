import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

public class UtilityTest {

    @Test
    public void testGenerateRandomList() {
        // Testing if the function generates a list of correct size
        List<Integer> list = Utility.generateRandomList(10);
        assertNotNull(list);  // Check that the list is not null
        assertEquals(10, list.size());  // Check that the list size is 10
    }

    @Test
    public void testFrequencyMap() {
        // Testing the frequency map function
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 3);
        Map<Integer, Integer> frequencyMap = Utility.frequencyMap(numbers);

        // Test that each integer appears the correct number of times
        assertEquals(1, frequencyMap.get(1));  // 1 occurs 1 time
        assertEquals(2, frequencyMap.get(2));  // 2 occurs 2 times
        assertEquals(3, frequencyMap.get(3));  // 3 occurs 3 times
    }

    @Test
    public void testSortList() {
        // Testing the sort function
        List<Integer> numbers = Arrays.asList(3, 1, 2, 4, 5);
        List<Integer> sortedList = Utility.sortList(numbers);

        // Check that the list is sorted in ascending order
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), sortedList);
    }
}
