package javatraining.oletsky.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @author O.Oletsky
 * Finding anagrams
 */

public class Anagrams {
    public static void main(String[] args) {
        //Initial dictionary
        String[] dict = {
                "qwerty",
                "tovar",
                "apelsin",
                "baobab",
                "spaniel",
                "avtor",
                "kvak",
                "tavro",
                "night",
                "kvazimodo",
                "thing",
                "silent",
                "listen"
        };
        HashMap<String, ArrayList<String>> anagrams=new HashMap<>();

        //Forming anagrams
        for (String s: dict) {
            String key = sortString(s);
            if (anagrams.containsKey(key)) {
                anagrams.get(key).add(s);
            }
            else {
                ArrayList<String> newList=new ArrayList<>();
                newList.add(s);
                anagrams.put(key,newList);
            }

        }

        //Outputting anagrams
        for (var entry:anagrams.entrySet()) {
            var list=entry.getValue();
            if (list.size()>1) {
                for (var l : list) {
                    System.out.print(l + " ");
                }
                System.out.println();
            }

        }
    }

    static String sortString(String s){
        char[] carr=s.toCharArray();
        Arrays.sort(carr);
        return new String(carr);

    }
}

