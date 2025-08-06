import java.util.ArrayList;
import java.util.List;

public class SuperExample {
    public static void main(String[] args) {

        List<Object> objects = new ArrayList<>();

        List<? super Object> superList = objects;

        superList.add("String");
        superList.add(10);
        superList.add(20);

        int num = (int) superList.get(1);
        System.out.println(num);

        for (Object obj : superList) {
            System.out.println(obj);

//            if (obj instanceof Integer) {
//                int num = (Integer) obj;
//                System.out.println("Integer value: " + num);
//            }
        }
    }
}
