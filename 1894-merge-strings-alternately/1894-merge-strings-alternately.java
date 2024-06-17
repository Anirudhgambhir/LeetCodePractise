class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0, j = 0, k = 0;
        char[] answer = new char[word1.length() + word2.length()];
        while (i < word1.length() && j < word2.length()) {
            answer[k++] = word1.charAt(i++);
            answer[k++] = word2.charAt(j++);
        }
        if (i < word1.length()) {
            while (i < word1.length()) {
                answer[k++] = word1.charAt(i++);
            }
        }
        if (j < word2.length()) {
            while (j < word2.length()) {
                answer[k++] = word2.charAt(j++);
            }
        }
        return new String(answer);
    }
}