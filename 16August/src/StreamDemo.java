
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        String str = "helloworld";

        Map<Character, Long> collect = str.chars().mapToObj(x -> (char)x)
                .collect(Collectors.groupingBy(y -> y,Collectors.counting()));
        System.out.println(collect);
    }
}
