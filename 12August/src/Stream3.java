import java.util.Arrays;
import java.util.List;

public class Stream3 {
    public static void main(String[] args) {
        String[] animals = {"tiger", "lion", "cat", "dog", "elephant"};
        List<String> list = Arrays.stream(animals).filter(x -> x.length() > 3)
                .map(String::toUpperCase)
                .toList();
        System.out.println(list);
    }
}
