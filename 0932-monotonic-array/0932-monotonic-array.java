class Solution {
    public boolean isMonotonic(int[] nums) {
        return checkMonotonic(nums, nums.length, false) 
            || checkMonotonic(nums, nums.length, true);
    }

    private boolean checkMonotonic(int[] nums, int length, boolean isIncreaseCheck) {
        for (int i = 1; i < length; i++) {
            if (isIncreaseCheck) {
                if (nums[i] < nums[i - 1]) {
                    return false;
                }
            }
            else {
                if (nums[i] > nums[i - 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    
}