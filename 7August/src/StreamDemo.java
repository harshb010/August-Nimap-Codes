//Given an integer array  nums return true if any value appears at least twice
//in the array, and return false if every element is distinct

import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        boolean b = Arrays.stream(arr).boxed().collect(Collectors.toSet()).size() < arr.length;
        System.out.println(b);

    }
}
