package javalistsandmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class JavaListsAndMaps {

    public static void main(String[] args) {

        ListPart();

        MapPart();
    }

    private static void MapPart() {
        // <Key , Value>
        Map<String, String> capitals = new HashMap<>();
        capitals.put("France", "Paris");
        capitals.put("Germany", "Berlin");
        capitals.put("Spain", "Madrid");
        PrintMap(capitals);
        System.out.println(capitals.get("France"));
        PrintOneValueInMapBasedOnKey(capitals, "Germany");
        PrintOneValueInMapBasedOnKey(capitals, "Cairo");

        String valueRemove = capitals.remove("Germany"); // return value
        System.out.println("<" + "Germany , " + valueRemove + ">");
        System.out.println(capitals);

        capitals.put("Greece", "Athens");
        capitals.put("Brazil", "Brazilia");
        capitals.put("Italy", "Rome");
        PrintRemoveValueMapBasedOnKey(capitals, "Greece");
        PrintRemoveValueMapBasedOnKey(capitals, "Canada");
    }

    private static void PrintRemoveValueMapBasedOnKey(Map<String, String> map, String key) {
        String valueRemove = map.remove(key); // return value
        if (valueRemove != null) {
            System.out.println("<" + key + "  , " + valueRemove + "> is removed!!!!!");
        } else {
            System.out.println("There is no key (" + key + ") in the map!!!!");
        }
    }

    private static void PrintOneValueInMapBasedOnKey(Map<String, String> map, String key) {
        if (map.get(key) != null) {
            System.out.println("At this key: " + key + " ,The value is: " + map.get(key));
        } else {
            System.out.println("This key (" + key + ") is not in this map: " + map);
        }
    }

    private static void PrintMap(Map<String, String> map) {
        System.out.println(map);
    }

    // ####### List Part ####################################################
    private static void ListPart() {
        List<String> rivers = new ArrayList<>();
        rivers.add("Nile");
        rivers.add("Eufrat");
        rivers.add("Amazon");
        PrintList(rivers);
        rivers.remove("Amazon");
        System.out.println(rivers);
        rivers.add("Mississippi");
        rivers.add("Danube");
        System.out.println(rivers);
        System.out.println(rivers.get(2));
        System.out.println(rivers.indexOf("Nile"));

        try {
            ListItemAndItsIndex(rivers, "Nile");
        } catch (Exception e) {
            System.out.println("There is an exception");
        }

        try {
            ListItemAndItsIndex(rivers, "Amazon");
        } catch (Exception e) {
            System.out.println("*************");
        }

        // --- IndexOutOfBoundsException -------------------------------------
        try {
            ListItemViaItsIndex(rivers, 3);
        } catch (Exception e) {
            System.out.println("There is an exception");
        }

        try {
            ListItemViaItsIndex(rivers, 20);
        } catch (Exception e) {
            System.out.println("--- There is an exception ---");
            System.out.println(e.getMessage());
            System.out.println("--- " + e.getClass().getSimpleName() + " ---");
        }
        // -----------------------------------------------------------------
    }

    private static void PrintList(List<String> list) {
        for (String item : list) {
            System.out.println(item);
        }
    }

    // this method does not throw any exception but I write here throws key word
    private static void ListItemAndItsIndex(List<String> list, String item) throws Exception {
        System.out.println(item + " has index: " + list.indexOf(item));
    }

    private static void ListItemViaItsIndex(List<String> list, int index) throws Exception {
        System.out.println("The item in the index (" + index + ") is: " + list.get(index));
    }
}
