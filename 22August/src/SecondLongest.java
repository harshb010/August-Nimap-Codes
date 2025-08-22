import java.util.Collection;
import java.util.stream.Collectors;

public class SecondLongest {
    public static void main(String[] args) {
        String str = "aaabbcdcccdeeee";
                 str.chars()
                .mapToObj(x -> (char) x)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

    }
}
