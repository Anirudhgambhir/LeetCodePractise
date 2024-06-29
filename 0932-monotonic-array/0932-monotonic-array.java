class Solution {
    public boolean isMonotonic(int[] nums) {
        return isDecreasingMonotonic2(nums, nums.length, true) 
            || isDecreasingMonotonic2(nums, nums.length, false);
    }

    // private boolean isIncreasingMonotonic(int[] nums, int length) {
    //     for (int i = 1; i < length; i++) {
    //         if (nums[i] > nums[i - 1]) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    private boolean isDecreasingMonotonic2(int[] nums, int length, boolean isIncreaseCheck) {
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