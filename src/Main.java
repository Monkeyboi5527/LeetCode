
// LeetCode
    void main() {
    
}
    /// Given a string s consisting of words and spaces, return the length of the last word in the string.
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        int count = 0;
        
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        
        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }

        return count;
    }


