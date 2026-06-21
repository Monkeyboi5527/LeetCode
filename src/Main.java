
// LeetCode
    void main() {
    
}
    /// Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        int result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if ((long) mid * mid == x) {
                return mid;
            } else if ((long) mid * mid < x) {
                result = mid;        
                left = mid + 1;      
            } else {
                right = mid - 1;     
            }
        }

        return result;
    }

