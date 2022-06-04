class Solution {
    public int[] decompressRLElist(int[] nums) {
        // for(int i = 0;i<nums.length;i+=2)
        // int freq = [nums[2*i]];
        // int value = nums[2*i+1];
        
    ArrayList<Integer> result= new ArrayList<Integer>();
    // int result = new int[nums.length];
    for (int i = 0; i < nums.length; i = i+2) {
        for (int j = 0; j < nums[i]; j++) {
            result.add(nums[i+1]);
        }
    }
     return result.stream().mapToInt(i -> i).toArray();



    }
}