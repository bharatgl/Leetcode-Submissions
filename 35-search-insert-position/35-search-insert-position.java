class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        int mid ;
        
        while(start <= end){
             mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            } if(nums[mid] < target){
                    start = mid + 1;
                      ans = mid + 1;
            }else{
                  ans =  mid;
                  end = mid - 1;
                 
            }
        }
        return ans;
    }
}
// class Solution {
//     public int searchInsert(int[] nums, int target) {
//         int l=0; int r=nums.length-1, mid , ans =-1;
//         while(l<=r){
//             mid = l+(r-l)/2;
//             if(nums[mid] == target)
//                 return mid;
//             if(nums[mid]<target){
//                 l=mid+1;
//                 ans = mid+1;
//             }else{
//                 ans = mid;
//                 r = mid-1;
//             }
//         }
//         return ans;
// }
// }