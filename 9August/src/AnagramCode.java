
import java.util.*;
class AnagramCode {
    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Map<String, List<String>> map = new HashMap<>();

        for(String str : words)
        {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);
            if(!map.containsKey(sorted))
            {
                map.put(sorted, new ArrayList<String>());
            }
            map.get(sorted).add(str);

        }

        System.out.println(map);

    }
}
