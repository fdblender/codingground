/**
 * Reverse String methods 
 * 
 * @author Frances Blendermann
 */

public class ReverseString {
    
    // this method uses the StringBuffer reverse method
    public static String reverseStringBuffer(String s) {
        StringBuffer rs = new StringBuffer();
        rs.append(s);
        rs.reverse();
        return rs.toString();
    }
    
    // this method reverses a string one character at a time
    public static String reverse(String s) {
        
        StringBuffer rs = new StringBuffer();
        
        for (int i = s.length()-1; i >=0; i--) {
            rs.append(s.charAt(i));
        }
        return rs.toString();
    }
    
    public static void main(String[] args) {
        String s = "gfedbca";
        System.out.println(reverse(s));
        System.out.println(reverseStringBuffer(s));
    }
}