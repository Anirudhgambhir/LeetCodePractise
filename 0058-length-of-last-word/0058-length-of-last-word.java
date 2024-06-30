class Solution {
    private final char SPACE_CHAR = ' ';

    public int lengthOfLastWord(String s) {
        int length = 0;
        for (int i = s.length() -1; i>=0; i--) {
            if (s.charAt(i) == SPACE_CHAR && length == 0)
                continue;
            else if (s.charAt(i) == SPACE_CHAR)
                break;
            length++;
        }
        return length;
    }
}