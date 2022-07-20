class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap <Integer, Integer> map = new HashMap<>();
        int [] nxtGrt = new int[nums1.length];
        changeMap(map,nums2);
        
        return findGrtElement(map,nums1, nums2, nxtGrt);
    }
    
    public int [] findGrtElement(HashMap<Integer, Integer> map, int[] nums1, int[] nums2,int [] nums3){
       for(int i = 0; i<nums1.length;i++){
           int mapLength = map.get(nums1[i]);
           int maximum = nums1[i];
           for(int j = mapLength;j<nums2.length;j++){
               if(nums2[j]>maximum){
                   maximum = nums2[j]; // update the value of second array
                   break;
               }
           }
           if(maximum>nums1[i]){
               nums3[i] = maximum;
           }else {
               nums3[i] = -1;
           }
       } 
        return nums3;
    }
    
    public void changeMap(HashMap<Integer,Integer> map, int [] nums2){
        int n = nums2.length;
        for(int i = 0;i<n;i++){
            map.put(nums2[i],i);
        }
    }
}
