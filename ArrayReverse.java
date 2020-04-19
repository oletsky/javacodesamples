package javatraining.oletsky.arrays;

import java.util.Arrays;

/**
 * @author O.Oletsky
 * Inversing an array
 */
public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr={10, 20, 30, 40, 50};
        for (int i=0; i<arr.length/2; i++) {
           var tmp = arr[arr.length-i-1];
           arr[arr.length-i-1]=arr[i];
           arr[i]=tmp;

        }
        System.out.println(Arrays.toString(arr));
    }
}
