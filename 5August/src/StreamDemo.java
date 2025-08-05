import java.util.List;
import java.util.PrimitiveIterator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> names = List.of("Anu", "Bob", "Amit", "Charlie");
        List<String> a = names.stream().filter(x -> x.startsWith("A"))
                .map(String::toUpperCase)
                .toList();
        System.out.println(a);
    }
}
