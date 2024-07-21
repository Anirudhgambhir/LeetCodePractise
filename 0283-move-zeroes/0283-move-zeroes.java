class Solution {
    public void moveZeroes(int[] nums) {
        int initialPtr = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[initialPtr++] = nums[i];
            }
        }
        if (initialPtr != 0) {
            for (int i = initialPtr; i < nums.length; i++) {
                nums[i] = 0;
            }
        }
    }
}