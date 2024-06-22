class Solution {
    public int strStr(String h, String n) {
        boolean flag = false;
        for (int i = 0; i <= h.length() - n.length(); i++) {
            if (n.charAt(0) == h.charAt(i)) {

                for (int j = 0; j < n.length(); j++) {

                    if (n.charAt(j) != h.charAt(j + i)) {

                        flag = false;
                        break;

                    }

                    else {

                        flag = true;

                    }
                }

                if (flag) {
                    return i;
                }
            }
        }
        return -1;
    }
}