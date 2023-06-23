package assignment1;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class randomly_change {
    public static void main(String[] args) {
        Integer[] numbers = {1,2,3,4,5,6,7,8,9,0}; // use Integer instead of int to create a list
        List<Integer> list = Arrays.asList(numbers); // convert the array to a list
        Collections.shuffle(list); // shuffle the list
        System.out.println(list); // print the shuffled list
    }
}