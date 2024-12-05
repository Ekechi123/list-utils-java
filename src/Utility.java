import java.util.*;

/**
 * Utility class that provides methods to generate random lists, calculate frequencies, and sort lists.
 */
public class Utility {

    /**
     * Generates a list of random integers of the specified size.
     * 
     * @param size the number of integers in the generated list
     * @return a list containing randomly generated integers
     */
    public static List<Integer> generateRandomList(int size) {
        Random random = new Random();
        List<Integer> randomList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            randomList.add(random.nextInt(100));  // Random number between 0 and 99
        }
        return randomList;
    }

    /**
     * Returns a frequency map where the key is the integer and the value is its frequency.
     * 
     * @param numbers the list of integers
     * @return a map containing the integers and their respective frequencies
     */
    public static Map<Integer, Integer> frequencyMap(List<Integer> numbers) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (Integer num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        return frequencyMap;
    }

    /**
     * Sorts the list of integers in ascending order.
     * 
     * @param numbers the list of integers to be sorted
     * @return a sorted list in ascending order
     */
    public static List<Integer> sortList(List<Integer> numbers) {
        Collections.sort(numbers);
        return numbers;
    }
}
