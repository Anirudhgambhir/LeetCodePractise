class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanValues = Map.of('I', 1, 'V', 5, 'X',  10, 'L', 50,'C', 100,'D', 500, 'M',1000);
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i+1 < s.length() && romanValues.get(s.charAt(i)) < romanValues.get(s.charAt(i+1)))
                result -= romanValues.get(s.charAt(i));
            else
                result += romanValues.get(s.charAt(i));
        }
        return result;
    }
}