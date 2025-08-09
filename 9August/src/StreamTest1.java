import java.util.stream.Stream;

public class StreamTest1 {
    public static void main(String[] args) {
        Stream.of("a","b","c","","e","f").takeWhile(s->!s.isEmpty())
                .forEach(System.out::print);
    }
}