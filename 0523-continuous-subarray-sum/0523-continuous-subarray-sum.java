class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        if(k==0){
            boolean Zeroes = false;
            for(int i=1;i<nums.length;i++){
                if(nums[i]==0 && nums[i-1]==0){
                    Zeroes = true;
                }
            }
            
            return Zeroes;
        }
        map.put(0,-1);
        int prefixSum = 0;
        for(int i=0;i<nums.length;i++){
           prefixSum = prefixSum + nums[i];
            if(map.containsKey(prefixSum%k)){
                if((i-(map.get(prefixSum%k)))>1){
                    return true;
                }
            }
            map.putIfAbsent(prefixSum%k,i);
            
        }
        return false;
    }
}