class Solution {
    public int balancedStringSplit(String s) {  
         int countL=0;
         int ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L') countL++;
            else countL--;
            if(countL==0) ans++;
        }   
        return ans;
    }
}
