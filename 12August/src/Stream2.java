import java.util.Arrays;
import java.util.List;

public class Stream2 {
    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "mango", "kiwi", "avocado"};
        List<String> a = Arrays.stream(fruits).filter(x -> x.startsWith("a"))
                .map(String::toUpperCase)
                .toList();
        System.out.println(a);
    }
}
