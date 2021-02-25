/*
 * @lc app=leetcode.cn id=832 lang=java
 *
 * [832] 翻转图像
 */

// @lc code=start
class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int m = A.length;
        int n = A[0].length;
        int[][] res = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=n-1;j>=0;j--){
                res[i][n-j-1]=A[i][j]^1;
            }
        }
        return res;
    }
}
// @lc code=end

