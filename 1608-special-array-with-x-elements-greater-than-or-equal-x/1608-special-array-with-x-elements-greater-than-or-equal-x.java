class Solution {

    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if (nums[0] >= n) {
            return n;
        }
        int x = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i - 1] > n) {
                return -1;
            }
            if (nums[i] == nums[i - 1]) {
                continue;
            }
            int p = n - i;
            if (nums[i] >= p && nums[i - 1] < p) {
                return p;
            }
        }
        return -1;
    }
}
