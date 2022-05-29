class Solution {
    public int singleNonDuplicate(int[] nums) {
        int ans = -1;
        for(int i=0; i<nums.length-1; i+=2){
            if(nums[i] != nums[i+1]){
                ans = nums[i];
                break;
            }
            
        }
        
        if(nums.length == 1){
            return nums[0];
        }
        
        if(nums[nums.length -2] != nums[nums.length-1]){
        ans = nums[nums.length-1];
    }
        return ans;
    }
}