class Solution {
    public int maxDepth(String s) {
     int count =   0;
        int max = 0;
        
        if(s.length() == 0 || s == "("|| s== ")"){
            return 0;
        }
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '('){
                count++;
            }else if(s.charAt(i) == ')'){
                count--;
        }
            if(max < count){
                max = count;
            }
    }
        return max;
  }
}


// class Solution {
//     public int maxDepth(String s) {
//         int count = 0;
//         int max = 0;
//         if(s.length() == 0 || s == "(" || s == ")"){
//             return 0;
// }
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i) == '('){
//                 count++;
// }       else if(s.charAt(i) == ')'){
//                 count--;
// }
//             if(max < count){
//                 max = count;
// }
// }
//             return max;
//     }
// }