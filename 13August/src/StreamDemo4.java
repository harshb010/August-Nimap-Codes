import java.util.*;
import java.util.stream.*;

public class StreamDemo4 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Banana", "Apple", "Mango");
        List<String> sorted = words.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sorted);
    }
}
