
// LeetCode
    void main() {
    int[] nums = {0,0,1,1,1,2,2,3,3,4};
    System.out.println(removeDuplicates(nums));
}

    public int removeDuplicates(int[] nums) {
        int k = 1;
        // Cycles through the list
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i]; // Move the k number to the next open spot
                k++;               // +1 to k
            }
        }
        return k;
    }


