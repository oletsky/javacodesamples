package javatraining.oletsky.statements;

public class Fibonacci {
    public static void main(String[] args) {
        int prev=1;
        int next=1;
        int n=200;
        System.out.print(prev+" "+next+" ");
        while(true) {
            int nnn=next;
            next+=prev;
            if (next>n) break;
            else {
                prev=nnn;
                System.out.print(next+" ");

            }
        }
    }
}
