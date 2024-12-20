class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) 
            return false;
        final int ASCII_VALUE_OF_A = 97;
        int[] letters = new int[26];
        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i) - ASCII_VALUE_OF_A]++;
            letters[t.charAt(i) - ASCII_VALUE_OF_A]--;
        }
        for (int i : letters) {
            if (i != 0)
                return false;
        }
        return true;
    }
}