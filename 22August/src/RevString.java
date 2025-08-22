import java.util.stream.Collectors;

public class RevString {
    public static void main(String[] args) {
        String str = "harshal";
        String collect = str.chars()
                .mapToObj(ch -> (char) ch)
                .toList()
                .reversed()
                .stream().map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(collect);


    }
}
