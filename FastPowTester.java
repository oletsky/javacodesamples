package mathcomp.oletsky.fastpow;

public class FastPowTester {
    public static void main(String[] args) {
        double base=2.;
        int power=44;
        double res=fastPow(base,power);
        System.out.println("Fast: "+res);
        System.out.println("Test: "+Math.pow(base, power));
    }
    static double fastPow(double x, int n){
        double res=1.;
        while (n>0) {
            if (n%2==0) {
                n/=2;
                x*=x;
            }
            else {
                n--;
                res*=x;
            }
        }
        return res;
    }
}
