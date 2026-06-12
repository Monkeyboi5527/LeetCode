
// LeetCode
    void main() {
    int[] nums = {3,2,2,3};
    System.out.println(removeElement(nums, 3));
}

    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }


