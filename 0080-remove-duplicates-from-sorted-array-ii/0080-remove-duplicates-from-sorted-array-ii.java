class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 1, count = 1;
        // Iterate over the array
        for (int j = 1; j < nums.length; j++) {

            // Use If-Else to find the similar numbers
            if (nums[j] == nums[j-1]) {
                count++;
            }
            else {
                count = 1;
            }

            // If they are Less than 2 similar ones we can move ahead.
            if (count <= 2) {
                nums[i++] = nums[j];
            }
        }
        return i;
    }
}