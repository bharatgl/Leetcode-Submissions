class Solution {
    public boolean halvesAreAlike(String s) {
s=s.toLowerCase();
int n =s.length();
int cnt=0;
int cnt1=0;
for(int i=0;i<(n/2);i++){

            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                cnt+=1;     
            }
        }  
        for(int j=(n/2);j<n;j++){
        
            if(s.charAt(j)=='a' || s.charAt(j)=='e' || s.charAt(j)=='i' || s.charAt(j)=='o' || s.charAt(j)=='u'){
                cnt1+=1;
            }
        }
    
    if(cnt==cnt1){
        return true;
    }
    else{
        return false;
       }
    }
}