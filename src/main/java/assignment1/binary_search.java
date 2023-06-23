package assignment1;
import java.util.Arrays;
class binary_search{
    public static void main(String args[]){
        //define an array
        int intArray[] = {1,6,9,3,5,8,7};
        System.out.println("The input Array : " + Arrays.toString(intArray));
        //define the key to be searched
        int key = 5;
        System.out.println("\nThe key to be searched:" + key);
        //call binarySearch method on the given array with key to be searched
        int result = Arrays.binarySearch(intArray,key);
        //print the return result
        if (result < 0)
            System.out.println("\nKey is not found in the array!");
        else
            System.out.println("\nKey is found at index: "+result + " in the array.");
    }
}