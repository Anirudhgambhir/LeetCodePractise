class Solution {
    public boolean isMonotonic(int[] nums) {
        return isIncreasingMonotonic(nums, nums.length) 
            || isDecreasingMonotonic(nums, nums.length);
    }

    private boolean isIncreasingMonotonic(int[] nums, int length) {
        for (int i = 1; i < length; i++) {
            if (nums[i] > nums[i - 1]) {
                return false;
            }
        }
        return true;
    }

    private boolean isDecreasingMonotonic(int[] nums, int length) {
        for (int i = 1; i < length; i++) {
            if (nums[i] < nums[i - 1]) {
                return false;
            }
        }
        return true;
    }
}