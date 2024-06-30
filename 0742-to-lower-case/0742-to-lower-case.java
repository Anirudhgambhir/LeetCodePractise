class Solution {
    private static final int ASCII_CODE = 32;
    private static final int ASCII_OF_A = 65;
    private static final int ASCII_OF_Z = 90;
    public String toLowerCase(String s) {
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (ASCII_OF_A <= (int) charArray[i] && (int) charArray[i] <= ASCII_OF_Z) {
                final int asciiVal = charArray[i] + ASCII_CODE;
                charArray[i] = (char) asciiVal;
            }
        }
        return String.valueOf(charArray);
    }
}