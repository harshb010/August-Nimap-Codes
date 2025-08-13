import java.util.*;
import java.util.stream.*;

public class StreamDemo1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 5, 6, 9, 10);
        List<Integer> evens = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evens);
    }
}
