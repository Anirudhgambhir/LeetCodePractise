class Solution {
    public boolean lemonadeChange(int[] bills) {
        if (bills[0] > 5) return false;
        int fiveDollarNotes = 0, tenDollarNotes = 0;
        for (int bill : bills) {
            if (bill == 5) {
                fiveDollarNotes += 1;
            } else if (bill == 10) {
                if (fiveDollarNotes < 1) return false;
                tenDollarNotes += 1;
                fiveDollarNotes -= 1;
            } else if (bill == 20) {
                if (tenDollarNotes >= 1 && fiveDollarNotes >= 1) {
                    fiveDollarNotes -= 1;
                    tenDollarNotes -= 1;
                } else if (fiveDollarNotes >= 3) {
                    fiveDollarNotes -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}