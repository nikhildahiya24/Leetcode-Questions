class Solution {

    public int findKthPositive(int[] arr, int k) {
        if (arr[0] > k) {
            return k;
        }
        int start = 0;
        int end = arr.length - 1;
        int ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] - (mid + 1) < k) {
                ans = mid + 1;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return k + ans;
    }
}
