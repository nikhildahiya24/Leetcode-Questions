class Solution {

    public boolean isPerfectSquare(int num) {
        int start = 1;
        int end = num;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            long squaremid = mid * mid;
            if (squaremid == num) {
                return true;
            } else if (squaremid > num) {
                end = (int) mid - 1;
            } else {
                start = (int) mid + 1;
            }
        }
        return false;
    }
}
