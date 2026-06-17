
// LeetCode
    void main() {
    
}
    ///You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;  // no carry, done immediately
            }
            digits[i] = 0;      // was 9, becomes 0, carry continues
        }

        // Only reach here if every digit was 9 (e.g. [9,9,9])
        int[] result = new int[digits.length + 1];
        result[0] = 1;          // [1, 0, 0, 0]
        return result;
    }


