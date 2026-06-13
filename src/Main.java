
// LeetCode
    void main() {
    String s1 = "hello";
    String s2 = "ll";
    System.out.println(strStr(s1,s2));
    
}

    public int strStr(String haystack, String needle) {
        int h = haystack.length();
        int n = needle.length();

        for (int i = 0; i <= h - n; i++) {
            if (haystack.substring(i, i + n).equals(needle)) {
                return i;
            }
        }

        return -1;
    }


