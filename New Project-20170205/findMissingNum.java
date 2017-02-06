import java.util.*;


public class findMissingNum {
    
        // you have a sequence of positive numbers starting with 1
        // find the missing number
        // an invalid sequence (non-numeric characters) return 1
        // a valid sequence or empty sequence returns 0
        // a broken sequence returns the lowest missing number
		public static int findMissingNumber(String sequence) {	

            // return 0 for empty string
            if (sequence.equals("")) {return 0;}
            
            // remove leading and trailing white spaces
            sequence = sequence.trim();
            
            // create array of strings from the string delimited by spaces
            String[] numstrings = sequence.split(" ");
            
            // create array of numbers, returning 1 if invalid character found
            List<Integer> numlist = new ArrayList<Integer>();
            for (String s : numstrings){
                if (s.matches("^\\d+$")) {
                    Integer n = new Integer(Integer.parseInt(s));
                    numlist.add(n);
                    System.out.printf("%d ",n);
                } else {
                    // return 1 if not a number
                    return 1;
                }
            }
            System.out.printf("%n");
            // sort the list of numbers
            Collections.sort(numlist);
            
            int i = 1;
            for (Integer n: numlist) {
                if (n == i) {
                    System.out.printf("%d ",n);
                    i++;
                } else {
                    return i;
                }
            }
            return 0;
            
		}
		
    public static void printNum(int n) {
        switch(n) {
        case 0: 
            System.out.println("Valid or Empty sequence: 0");
            break;
        case 1:
            System.out.println("Non-numeric character found or missing number of 1 found");
            break;
        default:
            System.out.printf("Missing number: %d%n",n);
        }
    }
   
    
    public static void main(String[] args) {
        int n;
        
        //int n = findMissingNumber("1 2 3 5");
        //System.out.printf("Missing number: %d\n", n);
       // n = findMissingNumber("1 3");
        //System.out.printf("Missing number: %d\n", n);
        //n = findMissingNumber("");
       // System.out.printf("Missing number: %d\n", n);
        
        n = findMissingNumber("1 2 3 4 5 6 7 8 9 10 11 13");
        printNum(n);
        
        n = findMissingNumber("2 1 4 3 a");
        printNum(n);
        n = findMissingNumber("1 2 3 4 5");
       printNum(n);
        n = findMissingNumber("5 2 4 3 1");
        printNum(n);
        n = findMissingNumber(" 5 2 4 3 ");
        printNum(n);
        
       }
    
}
