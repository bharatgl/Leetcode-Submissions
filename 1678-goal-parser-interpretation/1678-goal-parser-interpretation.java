

            
class Solution {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') sb.append("G");
            else if (command.charAt(i) == '(') {
                if (command.charAt(i+1) == ')') {
                    sb.append("o");
                    i++;
                } else if (command.charAt(i+1) == 'a') {
                    sb.append("al");
                    i += 3;
                }
            }
        }
        return sb.toString();
    }
}
        
//         class Solution {
//     public String interpret(String command) {
//         String result = "" ;
        
//         for (int i = 0; i < command.length(); i++) {
//             if (command.charAt(i) == 'G') {
//                 result += 'G' ;
//             }
//             else if (command.charAt(i) == '(') {
//                 if (command.charAt(i+1) == ')') {
//                     result += 'o' ;
//                     i++ ;
//                 }
//                 else {
//                     result += "al" ;
//                     i += 3 ;
//                 }
//             }
//         }
        
//         return result ;
//     }
// }
        
        
    