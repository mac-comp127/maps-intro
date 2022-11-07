package flags;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Flags {
    private static final Map<List<String>,String> flagsByColor = new HashMap<>();

    public static void main(String[] args) {

        // --------- Section 1 ---------

        System.out.println("------ Building the map ------");

        List<String> key = new ArrayList<>();
        key.add("green");
        key.add("white");
        flagsByColor.put(key, "Nigeria");
        findFlag(List.of("green", "white"));

        key.add("orange");
        flagsByColor.put(key, "Ireland");
        findFlag(List.of("green", "white", "orange"));

        key.add("blue");
        flagsByColor.put(key, "India");
        findFlag(List.of("green", "white", "orange", "blue"));

        // --------- Section 2 ---------

        // System.out.println("------ Using the map ------");

        // findFlag(List.of("green", "white"));
        // findFlag(List.of("green", "white", "orange"));
        // findFlag(List.of("green", "white", "orange", "blue"));
        // System.out.println("There are " + flagsByColor.size() + " flags");

        // --------- Section 3 ---------

        // System.out.println("------ Changing the map ------");

        // flagsByColor.put(List.of("green", "white", "orange"), "Côte d’Ivoire");
        // System.out.println("Now there are " + flagsByColor.size() + " flags");
        // findFlag(List.of("green", "white", "orange"));

        // --------- Section 4 ---------

        // System.out.println("------ All the flags ------");
        // for (Entry<List<String>, String> entry : flagsByColor.entrySet()) {
        //     System.out.println(entry.getKey() + " → " + entry.getValue());
        // }
    }

    private static void findFlag(List<String> colors) {
        System.out.println(
            colors + " → " + flagsByColor.get(colors));
    }
}
