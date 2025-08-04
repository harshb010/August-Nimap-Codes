import java.util.*;
import java.util.stream.*;

public class StreamDemo6 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 8, 3, 5);
        int max = nums.stream()
                .max(Integer::compare)
                .orElse(-1);
        System.out.println(max);
    }
}
