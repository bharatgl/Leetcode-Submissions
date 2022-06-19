class Solution {
    public String reverseWords(String str) {
        
        String arr[] = str.split(" ");
        
		String ans = "";
        
        for(int i=0; i< arr.length; i++){
            
            for(int j = arr[i].length() -1 ; j >=0 ; j--){
                ans += arr[i].charAt(j);
            }
            ans +=" ";
        }
        
        return ans.trim();
    }
}