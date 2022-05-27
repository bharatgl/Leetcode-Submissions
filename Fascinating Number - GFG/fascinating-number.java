// { Driver Code Starts
import java.util.*;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Solution ob = new Solution();

        int T = sc.nextInt();

        while (T != 0) {
            long n = sc.nextLong();
            if (ob.fascinating(n))
                System.out.println("Fascinating");
            else
                System.out.println("Not Fascinating");
            T--;
        }
    }
}// } Driver Code Ends


class Solution {
   boolean fascinating(long n) {
       String ConcatenatedNumber = "" + n*2 + n*3 + n;// concatenation
 
       char[] chars = ConcatenatedNumber.toCharArray(); //string to character array
       Arrays.sort(chars);  // sorting the character array

       String SortedNumber = String.valueOf(chars); 
       String OneToNine = "123456789";  
       boolean isFascinating = true;

       if (SortedNumber.equals(OneToNine) == false){
           isFascinating = false;
       }
       return isFascinating;
   }
}