// class Solution {
//     public String interpret(String command) {
//         //Goal Parser ----> command ----> "G", "()" and/or "(al)"
//         // "G" ------> "G", "()"
//         // "o", and "(al)" -----> "al"
//         // G()al
//      StringBuilder sb = new StringBuilder();
//         for(int i = 0;i<command.length();i++){
//             if(command.charAt(i)=="G"){
//                 sb.append("G");
//             }else if(command.charAt(i)=="("){
//                 if(command.charAt(i+1)==")"){
//                      sb.append("o");
//                       i++;
//                 }
//             }else if(command.charAt(i)=="A"){
//                  sb.append("al");
//                   i = i+3;
//             }
        
//         return sb.toString();
//        }
//     }
// }
            
//     //     if(string.includes("()")){
//     //     string = string.replaceAll("()", "o")
//     //   }
//     //     if(string.includes("(al)")){
//     //     string = string.replaceAll("(al)", "al")
//     //  }
//     // return string
        
        class Solution {
    public String interpret(String command) {
        String result = "" ;
        
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') {
                result += 'G' ;
            }
            else if (command.charAt(i) == '(') {
                if (command.charAt(i+1) == ')') {
                    result += 'o' ;
                    i++ ;
                }
                else {
                    result += "al" ;
                    i += 3 ;
                }
            }
        }
        
        return result ;
    }
}
        
        
    