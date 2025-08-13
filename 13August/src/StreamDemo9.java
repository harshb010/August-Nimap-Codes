import java.util.*;
import java.util.stream.*;

public class StreamDemo9 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tom", "Bob", "Alice", "John");
        Map<Integer, List<String>> grouped = names.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(grouped);
    }
}
