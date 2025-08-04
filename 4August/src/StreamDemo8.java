import java.util.*;
import java.util.stream.*;

public class StreamDemo8 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 5, 2, 3, 9);
        List<Integer> uniqueSorted = list.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(uniqueSorted);
    }
}
