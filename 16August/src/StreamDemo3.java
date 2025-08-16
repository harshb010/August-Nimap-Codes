//Find the maximum and minimum of a list of integers.
//Given a list of integers, write a Java 8 program to find the
//maximum and minimum numbers in the list.


import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamDemo3 {
    public static void main(String[] args) {
        List<Integer> list = List.of(2,3,4,1,5,6,5,3,2,20);
        Optional<Integer> max = list.stream().max(Comparator.naturalOrder());
        System.out.println(max.orElse(null));
        Optional<Integer> min = list.stream().min(Comparator.naturalOrder());
        System.out.println(min.orElse(null));
    }
}