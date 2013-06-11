package chh.util;

/**
 * A utility class containing calculations on numbers.
 * @author Christopher H. Harvey <chrisharvey2pi@gmail.com>
 * @version 2011.06.16
 */
public final class Number {
    /** Creates a new Number object. */ private Number() {}
    
    /**
     * Returns whether a given integer is prime.
     * An integer is mathematically prime if and only if its only integer divisors are itself and 1.
     * @param n the given integer
     * @return {@code true} if n is prime
     */
    public static boolean isPrime(int n) {
        boolean predicate = true;
        if (n <= 1) predicate = false;
        for (int i = 2; i < n; i++) {
            if (n % i != 0) {
                predicate = predicate && true;
            } else {
                predicate = predicate && false;
            }
        }
        return predicate;
    }
    /**
     * Determines whether a given integer n is a power of an integer r.
     * @param n the given integer to test
     * @param r the given root
     * @return {@code true} if n is a power of r
     */
    public static boolean isPowerOf(int n, int r) {
        boolean predicate = true;
        if (n == 1) predicate = true;
        else if (n % r == 0) predicate = isPowerOf(n / r, r);  // if n%r==0 then n/r will be an integer.
        else predicate = false;
        return predicate;
    }
    /**
     * Returns the arithmetic mean of two doubles.
     * The arithmetic mean of 'a' and 'b' is exactly half of the sum of 'a' and 'b'.
     * @param a the first double
     * @param b the second double
     * @return  the arithmetic mean of a and b
     */
    public static double aMean(double a, double b) {
        return (a + b) / 2.0;
    }
    /**
     * Returns the arithmetic mean of an array of doubles.
     * @param doubles   the array of doubles, with undetermined length
     * @return          the arithmetic mean of all the doubles in the array
     */
    public static double aMean(double[] doubles) {
        double sum = 0.0;
        int n = doubles.length;
        for (int i = 0; i < n; i++) {
            sum += doubles[i];
        }
        return sum / n;
    }
    /**
     * Returns the geometric mean of two doubles.
     * The geometric mean of 'a' and 'b' is the exact square root of the product of 'a' and 'b'.
     * @param a the first double
     * @param b the second double
     * @return  the geometric mean of a and b
     */
    public static double gMean(double a, double b) {
        return Math.sqrt(a * b);
    }
    /**
     * Returns the geometric mean of an array of doubles.
     * Mathematical note: if any entry in the given array is equal to 0, then this method will return {@code 0.0}.
     * @param doubles   the array of doubles, with undetermined length
     * @return          the geometric mean of all the doubles in the array
     */
    public static double gMean(double[] doubles) {
        double product = 1.0;
        int n = doubles.length;
        for (int i = 0; i < n; i++) {
            product *= doubles[i];
        }
        return Math.pow(product, 1.0 / n);
    }
    /**
     * Returns the logarithm base {@code b} of {@code x}.
     * @param x the argument of the logarithm
     * @param b the base of the logarithm
     * @return  {@code log_{b} (x)}
     */
    public static double log(double x, double b) {
        return Math.log(x) / Math.log(b);
    }
    /**
     * Returns the logarithm base 2 of {@code x}.
     * @param x the argument of the logarithm
     * @return  {@code log_{2} (x)}
     */
    public static double log2(double x) {
        return Number.log(x, 2.0);
    }
    /**
     * Returns the logarithm base 10 of {@code x}.
     * @param x the argument of the logarithm
     * @return  {@code log_{10} (x)}
     */
    public static double log10(double x) {
        return Number.log(x, 10.0);
    }
    /**
     * Returns the natural logarithm (base <i>e</i>) of {@code x}.
     * @param x the argument of the logarithm
     * @return  {@code ln (x)}
     */
    public static double ln(double x) {
        return Number.log(x, Math.E);
    }
}
