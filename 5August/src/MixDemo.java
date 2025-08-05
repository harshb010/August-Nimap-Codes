import java.util.List;

public class MixDemo {
    public static void main(String[] args) {
        List<String> animals = List.of("tiger", "lion", "elephant", "zebra", "deer", "leopard", "bear");
        List<String> list = animals.stream()
                .sorted()
                .skip(2)
                .limit(3)
                .map(String::toUpperCase)
                .toList();
        System.out.println(list);
    }
}
