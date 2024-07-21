class Solution {
    public int countOdds(int low, int high) {
        final int oddNumbers = (high - low) / 2;
        return low % 2 != 0 || high % 2 != 0 ?
            oddNumbers + 1 : oddNumbers;
    }
}