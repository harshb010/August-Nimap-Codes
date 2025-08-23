import java.util.Arrays;
import java.util.List;

public class Stream1 {
    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "mango"};
        List<String> endsWithO = Arrays.stream(fruits).filter(x -> x.endsWith("o")).toList();
        System.out.println(endsWithO);
    }
}
