class Solution {
    public int[] twoSum(int[] nums, int target) {
//         int[] ans = new int[2]; 
//        for(int i=0; i<nums.length; i++){
//            for(int j=i+1 ; j<nums.length; j++){
//                if(nums[i] + nums[j] == target){
//                    ans[0] =i;
//                    ans[1] = j;
//                    break;
//                }
//            }
          
//        }
//         return ans;


         HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i = 0;i<nums.length;i++){
            int complement = target - nums[i];
            if(hm.containsKey(complement)){
                return new int []{hm.get(complement),i};
            }else{
                hm.put(nums[i],i);
            }
        }
        return new int []{};
        
    }
}