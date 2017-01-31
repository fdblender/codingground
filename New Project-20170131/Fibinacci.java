/**
 * Fibinacci methods to find the nth term - recursive and iterative
 * @author Frances Blendermann
 */

public class Fibinacci {
    /*
    * recursive version of Fibinacci
    */
    public static int rFibinacci(int nth) {
        if (nth == 1 || nth == 2) {
            return 1;
        }
        int fib = rFibinacci(nth-1) + rFibinacci(nth-2);
        System.out.print(" "+fib);
        return fib;
    }
    
    /* 
    * Iterative Fibinacci - calculate nth number of Fib series
    */
    public static int iFibinacci(int nth) {
        int fib = 1;
        if (nth == 1 || nth == 2) {
            return 1;
        }
        int fib1 = 1;
        int fib2 = 1;
        
        for (int i=3; i<=nth; i++) {
            fib = fib1 + fib2;
            System.out.print(" "+fib);
            fib2 = fib1;
            fib1 = fib;
        }
        
        return fib;
    }
    public static void main(String[] args) {
        int nthTerm = 10;
        System.out.printf("\nIterative Fibinacci of term %d: %d%n", nthTerm, iFibinacci(nthTerm));
        
        System.out.printf("\nRecursive Fibinacci of term %d: %d%n", nthTerm, rFibinacci(nthTerm));
        
    }
}
