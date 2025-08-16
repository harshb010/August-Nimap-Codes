import java.util.List;

public class FlatMapDemo {
    public static void main(String[] args) {
        List<List<String>> nestedFruits = List.of(
                List.of("apple", "banana"),
                List.of("mango", "orange", "kiwi")
        );

        List<String> list1 = nestedFruits.stream()
                .flatMap(list -> list.stream())
                .map(String::toUpperCase)
                .toList();
        System.out.println(list1);
    }
}
