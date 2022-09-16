class Solution {

    public boolean findRotation(int[][] mat, int[][] target) {
        boolean p = true, q = true, r = true, s = true;
        // four variables to check whether target is any rotation of matrix or not.

        int n = mat.length;
        int m = mat[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] != target[i][j]) {
                    p = false;
                }
                if (mat[i][j] != target[n - j - 1][i]) {
                    q = false;
                }
                if (mat[i][j] != target[n - 1 - i][n - 1 - j]) {
                    r = false;
                }
                if (mat[i][j] != target[j][n - 1 - i]) {
                    s = false;
                }
            }
        }

        return p | q | r | s;
        //if any of them is true , means we have find one rotation which equals target.
    }
}
