import java.util.*;

public class WildCard {

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static double sum(List<? extends Number> list) {
        double total = 0;
        for (Number num : list) {
            total += num.doubleValue();
        }
        return total;
    }

    public static void addIntegers(List<? super Integer> list) {
        list.add(1);
        list.add(2);
    }

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("A", "B", "C");
        printList(stringList);

        List<Integer> intList = Arrays.asList(1, 2, 3);
        System.out.println("Sum: " + sum(intList));

        List<Number> numList = new ArrayList<>();
        addIntegers(numList);
        printList(numList);
    }
}
