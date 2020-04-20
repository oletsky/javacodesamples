package javatraining.oletsky.datatypes;

/**
 * @author O.Oletsky
 * Methods for comparing doubles
 */
public class DoubleCompareHelper {
    public static boolean doubleEquals(double a, double b, double EPS){
        return ((a>b-EPS)&&(a<b+EPS));
    }

    public static boolean doubleEquals(double a, double b){
        final double EPS=1.E-10;
        return doubleEquals(a,b,EPS);
    }

    public static boolean doubleLess(double a, double b, double EPS){
        return (a<b-EPS);
    }

    public static boolean doubleLess(double a, double b){
        final double EPS=1.E-10;
        return doubleLess(a,b,EPS);
    }

    public static boolean doubleBigger(double a, double b, double EPS){
        return (a>b+EPS);
    }

    public static boolean doubleBigger(double a, double b){
        final double EPS=1.E-10;
        return doubleBigger(a,b,EPS);
    }

    public static int doubleCompare(double a, double b){
        if (doubleLess(a,b)) return -1;
        if (doubleEquals(a,b)) return 0;
        else return 1;
    }

}

