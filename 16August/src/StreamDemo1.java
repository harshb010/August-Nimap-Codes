
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo1 {
    public static void main(String[] args) {
        String str = "hello";
        String xyz = str.chars().mapToObj(x -> (char) x)
                .toList().reversed()
                .stream().map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(xyz);
    }
}
