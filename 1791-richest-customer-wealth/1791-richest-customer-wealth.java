class Solution {
    // public int maximumWealth(int[][] accounts) {
    //     int wealthOfRichestCustomer = 0;
    //     for (int[] account : accounts) {
    //         int wealthOfCustomer = 0;
    //         for (int moneyInAccount : account) {
    //             wealthOfCustomer += moneyInAccount;
    //         }
    //         wealthOfRichestCustomer = Math.max(wealthOfCustomer, wealthOfRichestCustomer);
    //     }
    //     return wealthOfRichestCustomer;
    // }

    public int maximumWealth(int[][] accounts) {
        int wealthOfRichestCustomer = 0;
        for (int[] account : accounts) {
            wealthOfRichestCustomer = Math.max(Arrays.stream(account).sum(), wealthOfRichestCustomer);
        }
        return wealthOfRichestCustomer;
    }
}