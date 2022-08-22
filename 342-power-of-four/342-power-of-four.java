class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==2){
            return false;
        }
        int count=0;
        int one=0;
        while(n>0){
            if((n&1)==0){
                count++;
            }else{
                one++;
            }
            n=n>>1;
        }
        if(one==1 && count%2==0){
            return true;
        }
        else{
            return false;
        }
    }
}