/**
 * Factorial methods - recursive and iterative
 * 
 * @author Frances Blendermann
 */

public class Factorial {
    
    public static int ifactorial(int n) {
        int factorial = 1;
        
        for (int i = n; i>0; i--) {
            factorial = factorial * i;
           // System.out.println(factorial);
        }
        return factorial;
    }
    
    public static int rfactorial(int n) {
        if (n == 1) {
            return 1;
        }
        //System.out.println(n);
        return rfactorial(n-1) * n;
    }
    
    public static void main(String[] args) {
        int n = 5;
        System.out.printf("Iterative Factorial of %d is %d: %n",n, ifactorial(n));
        System.out.printf("Recursive Factorial of %d is %d: %n",n, rfactorial(n));
    }
}