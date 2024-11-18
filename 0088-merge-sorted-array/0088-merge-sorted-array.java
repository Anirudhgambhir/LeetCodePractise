class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int lastIndexOfMergedArray = nums1.length - 1;
        int lastIndexOfFirstArray = m - 1;
        int lastIndexOfSecondArray = n - 1;
        if (n != 0) {
            while (lastIndexOfFirstArray >= 0 && lastIndexOfSecondArray >= 0) {
                if (nums1[lastIndexOfFirstArray] >= nums2[lastIndexOfSecondArray]) {
                    nums1[lastIndexOfMergedArray] = nums1[lastIndexOfFirstArray];
                    lastIndexOfFirstArray--;
                }
                else if (nums1[lastIndexOfFirstArray] < nums2[lastIndexOfSecondArray]) {
                    nums1[lastIndexOfMergedArray] = nums2[lastIndexOfSecondArray];
                    lastIndexOfSecondArray--;
                }
                lastIndexOfMergedArray--;
            }
            while(lastIndexOfFirstArray >= 0){
                nums1[lastIndexOfMergedArray] = nums1[lastIndexOfFirstArray];
                lastIndexOfMergedArray--;
                lastIndexOfFirstArray--;
            }
            while(lastIndexOfSecondArray >= 0){
                nums1[lastIndexOfMergedArray] = nums2[lastIndexOfSecondArray];
                lastIndexOfMergedArray--;
                lastIndexOfSecondArray--;
            }
        }
    }
}