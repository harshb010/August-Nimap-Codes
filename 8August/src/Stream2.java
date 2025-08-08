import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stream2 {
    public static void main(String[] args) {
        String str = "swzziss";

        // Build frequency map with insertion order
        Map<Character, Long> freqMap = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ));

        // Find first character with count 1
        Optional<Character> firstUnique = freqMap.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();

        if (firstUnique.isPresent()) {
            char ch = firstUnique.get();
            int index = str.indexOf(ch);
            System.out.println("First non-repeating character: '" + ch + "' at index " + index);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }


}
