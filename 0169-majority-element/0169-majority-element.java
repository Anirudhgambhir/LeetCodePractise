class Solution {
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int occurence = 1;
        for (int i = 1; i < nums.length; i++) {
            if (candidate != nums[i]) {
                occurence--;
            }
            else {
                occurence++;
            }

            if (occurence == 0) {
                candidate = nums[i];
                occurence = 1;
            }
        }

        int occurrence = 0;
        for (int i : nums) {
            if (i == candidate) {
                occurrence++;
                if (occurrence > nums.length / 2) {
                    return candidate;
                }
            }
        }

        return -1;
        
    }
}