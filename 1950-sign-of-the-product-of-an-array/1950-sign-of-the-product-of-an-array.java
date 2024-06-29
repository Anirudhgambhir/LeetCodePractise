class Solution {
    public int arraySign(int[] nums) {
        // BRUTE FORCE
        int numbersLessThanZero = 0;
        for (int i : nums) {
            if (i == 0)
                return 0;
            else if (i < 0)
                numbersLessThanZero++;
        }
        return numbersLessThanZero % 2 == 0 ? 1 : -1;
    }
}