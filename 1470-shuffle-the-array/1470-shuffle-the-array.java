class Solution {
    public int[] shuffle(int[] nums, int n) {
      int size= nums.length;
        int ans[] = new int[size];
        int i = 0,j= 0;
     while(i<size){
         ans [i] = nums[j];
         ans[i+1] = nums[j+n];
         i +=2;
         j++;
     }
        return ans;
            
   }
}
