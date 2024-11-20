class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 0, right = 1;
        while (right < nums.length) {
            if (nums[left] == nums[right]) {
                right++;
            }
            else {
                nums[++left] = nums[right];
            }
        }
        return left + 1;
    }
}