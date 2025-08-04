import java.util.*;
import java.util.stream.*;

public class StreamDemo5 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5, 12, 18, 7, 30);
        long count = nums.stream()
                .filter(n -> n > 10)
                .count();
        System.out.println(count);
    }
}
