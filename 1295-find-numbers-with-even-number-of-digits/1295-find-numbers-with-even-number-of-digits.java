class Solution {
    public int findNumbers(int[] nums) {
        int count = 0; // for counting no of even integers
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i]; // for easy implementation
            int digits = 0; // for counting the number of digits in the number,( nums[i])
            while(temp > 0) {
                temp /= 10;
                digits++;
                }
            if (digits % 2 == 0)
                count++;
        }
        return count;
    }
}