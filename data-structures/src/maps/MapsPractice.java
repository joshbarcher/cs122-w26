package maps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

public class MapsPractice {
    public static void main() {
        //students/teachers mapped to attendance days
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();

        map.put("Josh", 20);
        map.put("Corey", 20);
        map.put("Russell", 13);
        map.put("Onyx", 17);
        map.put("Joe", 1);

        int attendance = map.get("Onyx");
        System.out.println("Onyx showed up " + attendance + " days!");

        Set<String> people = map.keySet();
        for (String person : people) {
            System.out.println("Found person: " + person);
        }

        int daysAttendedByAll = 0;
        Collection<Integer> values = map.values();
        for (int attended : values) {
            daysAttendedByAll += attended;
        }
        System.out.println("Total days attended: " + daysAttendedByAll);

        //print out pairs in the map
        for (String key : map.keySet()) {
            int value = map.get(key);
            System.out.println(key + ": " + value);
        }

        //if curious what this is all about, look up Java lambdas + streaming api
        map.keySet().forEach(el -> System.out.println(el + ": " + map.get(el)));
    }

    public static void aside() {
        //what if we wanted to maps days to people
        TreeMap<Integer, String> backwardsMap = new TreeMap<Integer, String>();

        backwardsMap.put(20, "Josh");
        backwardsMap.put(20, "Corey");
        backwardsMap.put(13, "Russell");
        backwardsMap.put(17, "Onyx");

        String person = backwardsMap.get(19);
        System.out.println(person);

        //alternatively we could use a Bijection (one-to-one correspondence)
    }
}
