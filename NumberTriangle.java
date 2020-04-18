package javatraining.oletsky.statements;

public class NumberTriangle {

    public static void main(String[] args) {
        int n=9;
        for (int i = n; i >=1; i--) {
            for (int j = i; j>=1 ; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

}
