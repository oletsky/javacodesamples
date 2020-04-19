package javatraining.oletsky.arrays;

public class FindTheMaximum {
    public static void main(String[] args) {
        int[] mas = {-12, 25, 3, -17, 7, 20};
        int max=mas[0];
        for (int i=1; i<mas.length; i++) {
            if (mas[i]>max) max=mas[i];
        }
        System.out.println("Max value is "+max);
    }
}
