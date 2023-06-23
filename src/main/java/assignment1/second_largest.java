package assignment1;

import java.util.Arrays;
public class second_largest {
    public static int getSecondLargest(int[] a) {
        Arrays.sort(a); // sort the array in ascending order
        return a[a.length-2]; // return the second last element
    }
    public static void main(String[] args) {
        int[] numbers = {5,3,9,7,4,1,8};
        System.out.println("Second largest element is: " + getSecondLargest(numbers));
    }
}
