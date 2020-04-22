package javatraining.oletsky.statements;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author O.Oletsky
 * Finding all prime numbers not exceeding given value
 */
public class Eratosfen {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the maximum value");
        final int N = scan.nextInt();
        boolean[] flags = new boolean[N + 1];
        Arrays.fill(flags, false);

        int currMult = 2;

        while (currMult < Math.sqrt(N)) {

            for (int k = 2; k <= (N/currMult); k++) {
                flags[currMult*k] = true;
            }

            currMult++;
        }

        int amount=0;
        System.out.println("Prime numbers until "+N+" are:");
        for (int i = 2; i <= N; i++) {
            if (!flags[i]) {
                amount++;
                System.out.print(i + " ");
                if (amount%10==0) System.out.print("\n");
            }

        }
        System.out.println();
        System.out.println("-----");
        System.out.println(amount+" prime numbers found");

    }

}

