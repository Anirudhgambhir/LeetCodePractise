class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealthOfRichestCustomer = 0;
        for (int[] account : accounts) {
            int wealthOfCustomer = 0;
            for (int moneyInAccount : account) {
                wealthOfCustomer += moneyInAccount;
            }
            wealthOfRichestCustomer = Math.max(wealthOfCustomer, wealthOfRichestCustomer);
        }
        return wealthOfRichestCustomer;
    }
}