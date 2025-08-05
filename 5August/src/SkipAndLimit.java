import java.util.List;

public class SkipAndLimit {
    public static void main(String[] args) {
        List<String> names = List.of("A", "B", "C", "D", "E", "F", "G", "H");

        List<String> page2 = names.stream()
                .skip(3)
                .limit(3)
                .toList();

        List<String> page3 = names.stream()
                .limit(5)
                .skip(3)
                .toList();

        System.out.println(page2);
        System.out.println(page3);

    }
}
