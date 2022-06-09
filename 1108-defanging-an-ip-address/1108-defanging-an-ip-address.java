class Solution {
    public String defangIPaddr(String address) {
     //    int n =  address.length();
     // Stringbuffer sb = new Stringbuffer( address);
     //    for(int i = 0;i<n;i++){
     //    if(sb.contains(".")){
     //        replace(i,i+1,"[.]");
     //        i--;
     //      }
     //    }
     //    return sb;
         String replaceString= address.replace(".", "[.]");
          return replaceString;
    }
}