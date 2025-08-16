import java.util.List;

public class DistinctDemo {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "orange", "banana", "apple", "kiwi", "banana");
        List<String> list = fruits.stream().distinct()
                .map(String::toUpperCase)
                .sorted()
                .toList();
        System.out.println(list);
    }
}
