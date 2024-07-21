class Solution {
    public double average(int[] salary) {
        int minSalary = Integer.MAX_VALUE, maxSalary = Integer.MIN_VALUE;
        int sumOfSalaries = 0;
        for (int sal : salary) {
            minSalary = Math.min(minSalary, sal);
            maxSalary = Math.max(maxSalary, sal);
            sumOfSalaries += sal;
        }
        return (double) (sumOfSalaries - minSalary - maxSalary) / (salary.length - 2);
    }
}