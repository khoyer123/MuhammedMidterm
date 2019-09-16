package datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UseMap {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         */

        Map<String, List <String>> map = new HashMap<>();

        List<String> valSetOne = new ArrayList<>();
        valSetOne.add("Apple");
        valSetOne.add("Airplane");

        List<String> valSetTwo = new ArrayList<>();
        valSetTwo.add("Bat");
        valSetTwo.add("Banana");

        List<String>valSetThree = new ArrayList<>();
        valSetThree.add("Cow");
        valSetThree.add("Cat");

        map.put("A", valSetOne);
        map.put("B", valSetTwo);
        map.put("c", valSetThree);

        System.out.println("Fetching keys and corresponding [Multiple] value n");
        for(Map.Entry<String, List<String>> entry: map.entrySet()){
            String key = entry.getKey();
            List<String> values = entry.getValue();
            System.out.println("Key =" +key);
            System.out.println(values);
        }
    }

}
