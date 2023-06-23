package assignment1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class duplicate_number {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,1,2,4,5,6,4}; // given array
        List<Integer> duplicates = new ArrayList<>(); // list to store duplicate elements
        Map<Integer,List<Integer>> positions = new HashMap<>(); // map to store positions of duplicate elements
        for (int i = 0; i < numbers.length; i++) { // outer loop for each element
            for (int j = i + 1; j < numbers.length; j++) { // inner loop for remaining elements
                if (numbers[i] == numbers[j]) { // if elements are equal
                    if (!duplicates.contains(numbers[i])) { // if element is not already in duplicates list
                        duplicates.add(numbers[i]); // add it to duplicates list
                    }
                    if (!positions.containsKey(numbers[i])) { // if element is not already in positions map
                        positions.put(numbers[i], new ArrayList<>()); // create a new list for its positions
                    }
                    positions.get(numbers[i]).add(j); // add the current position to the list
                }
            }
        }
        System.out.println("The duplicate elements are: " + duplicates); // print the duplicate elements
        System.out.println("The positions of duplicate elements are: " + positions); // print the positions of duplicate elements
    }
}
