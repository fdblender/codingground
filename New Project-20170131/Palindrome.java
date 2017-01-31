public class Palindrome {
    
    public static boolean palindrome(int num) {
       int temp = num;
       int sum = 0;
       int rem;
       
       while (temp > 0) {
           System.out.printf("temp: %d ", temp);
           rem = temp % 10;
           sum = (sum * 10) + rem;
           temp = temp/10;
           System.out.printf(" rem: %d  sum: %d %n", rem, sum);
        };
       
        if (sum == num) {
           return true;
        } else {
            return false;
        }
        
    }
    
    public static boolean palindrome(String s) {
        boolean isPalindrome = true;
        
        for (int i=0; i<= (s.length()/2); i++) {
            if (s.charAt(s.length() - i - 1) != s.charAt(i)) {
                isPalindrome = false;
            }
        }
        return isPalindrome;
    }
    
    public static void main(String[] args) {
        //System.out.println(palindrome(12321));
        System.out.println(palindrome("zoaoz"));
    }
}
