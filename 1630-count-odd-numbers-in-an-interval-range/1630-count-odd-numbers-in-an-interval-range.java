class Solution {
    public int countOdds(int low, int high) {
        int oddNumbers = (high - low) / 2;
        if (low % 2 != 0 || high % 2 != 0) {
            return oddNumbers + 1;
        }
        return oddNumbers;
    }
}