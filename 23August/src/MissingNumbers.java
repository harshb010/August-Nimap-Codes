import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MissingNumbers {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,5);

        Integer i = list.stream().sorted(Comparator.reverseOrder()).findFirst().get();
        Integer i1 = list.stream().sorted().findFirst().get();
        for(int j=i1;j<i;j++)
        {
            if(!list.contains(j))
            {
                System.out.println(j);
            }

        }

    }


}

