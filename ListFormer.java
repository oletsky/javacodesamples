package javatraining.oletsky.collections;

import java.util.ArrayList;

/**
 * @author O.Oletsky
 * Creating lists
 */

public class ListFormer {

    /**
     * A function for creating ArrayList from elems
     * Almost as convenient as if it were literal creating
     * @param elems
     * @param <T>
     * @return
     */

    public static <T> ArrayList<T> arrayList(T... elems) {
        ArrayList<T> list = new ArrayList<>();
        for (T el : elems) {
            list.add(el);
        }
        return list;
    }
}
