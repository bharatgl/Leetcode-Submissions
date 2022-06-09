// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            
            Solution ob = new Solution();
            String result = ob.removeVowels(s);
            
            System.out.println(result);
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    String removeVowels(String S) {
         Character vowels[] = {'a', 'e', 'i', 'o', 'u','A','E','I','O','U'};
            List<Character> al = Arrays.asList(vowels);
            StringBuffer sb = new StringBuffer(S);
            for (int i = 0; i < sb.length(); i++) {
                if (al.contains(sb.charAt(i))) {
                    sb.replace(i, i + 1, "");
                    i--;
                }
            }
            return sb.toString();
        }
}