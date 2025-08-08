import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamDemoExample {
    public static void main(String[] args) {
        String str = "swzziss";
        str.chars().filter(x -> str.indexOf(x) == str.lastIndexOf(x));

    }
}
//str.indexOf(x) != str.lastIndexOf(x)