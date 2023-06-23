package assignment1;
import java.util.Arrays;
class max_min {
    public static void main(String[] args) {
        int[] array = new int[]{97, 98, 9, 4, 22, 7, 2, 3, 19, 42};
        System.out.println("The input Array : " + Arrays.toString(array));
         Arrays.sort(array);
        System.out.println("Minimum value: " + array[0]);
          System.out.println("Maximum value: " + array[array.length - 1]);
    }
}