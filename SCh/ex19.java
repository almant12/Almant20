package SCh;

import java.util.*;

public class ex19 {
    public static void main(String[] args) {
        // String Arrays
        String[] strArrays = {
                "Cabbage",
                "Kale",
                "Radish",
                "Kale",
                "Garlic",
                "Beetroot",
                "Garlic",
                "Carrot",

        };

        // First convert to List
        List<String> list = Arrays.asList(strArrays);

        // just empty HashSet object
        Set<String> set = new
                HashSet<String>();

        // iterate through List
        for(String str : list) {
            // add element to Set/HashSet
            boolean flagForDuplicate = set.add(str);

            if(!flagForDuplicate) {
                System.out.println(str + " is duplicate element");
            }
        }
    }
}


