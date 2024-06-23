class Solution {
    public boolean repeatedSubstringPattern(String s) {
        /**
        Approach:-
        1. At worst, if substring is repeated. It's size will be half of string
        2. We take first half of the string (as str) and start from last of str
        3. For i = str.length tile i >= 1
        4. if s.length % i == 0 we proceed
        5. total parts needed (n) of substring(0,i)= substr to make length of s
        6. we append the string substr, n times and validate with string s
         */

         final int len = s.length();
         for (int i = len/2; i>= 1; i--) {
            if (len % i == 0) {
                int parts = len / i;
                String substr = s.substring(0,i);
                StringBuilder sb = new StringBuilder();
                for (int j=0;  j < parts; j++) {
                    sb.append(substr);
                }
                if (sb.toString().equals(s))
                    return true;
            }
         }
         return false;
    }
}