import java.util.*;
import java.util.stream.*;

public class StreamDemo3 {
    public static void main(String[] args) {
        Optional<String> name = Stream.of("A", "B", "C")
                .findFirst();
        name.ifPresent(System.out::println);
    }
}
