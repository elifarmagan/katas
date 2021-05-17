import java.util.*;

public class HashMapExample {

    public static void main(String[] args) {
        char[] list = {'a', 'a', 'c', 'd', 'c', 'a', 'b', 'e', 'b'};
        //(a,2),(b,3), (c,2)) this is Map.Entry
        Map<Character, Integer> result = makeHistogram(list);

        //Map.Entry<Integer, String> entry = new Map.Entry<>(); can't be instantiated

        System.out.println("KEY-VALUE");

        Set<Map.Entry<Character, Integer>> set = result.entrySet();

        for (Map.Entry<Character, Integer> entry : set) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println("KEY-VALUE");

        Iterator<Map.Entry<Character, Integer>> iterator = set.iterator();

        while (iterator.hasNext()) {
            Map.Entry<Character, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    private static Map<Character, Integer> makeHistogram(char[] list) {
        Map<Character, Integer> map = new HashMap<>();

        for (char item : list) {
            if (!map.containsKey(item)) {
                map.put(item, 1);
            } else {
                map.put(item, map.get(item) + 1);
            }
        }
        return map;
    }

}


