public class Solution extends GuessGame {

    public int guessNumber(int n) {
        int low = 1;
        int high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (guess(mid) == 0) {
                // picked number = mid
                return mid;
            } else if (guess(mid) == -1) {
                // picked number > mid
                high = mid - 1;
            } else if (guess(mid) == 1) {
                // picked number < mid
                low = mid + 1;
            }
        }
        return n;
    }
}
