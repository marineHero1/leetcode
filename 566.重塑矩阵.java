/*
 * @lc app=leetcode.cn id=566 lang=java
 *
 * [566] 重塑矩阵
 */

// @lc code=start
class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int m = nums.length;
        int n = nums[0].length;
        if(m*n!=r*c){
            return nums;
        }
        int[][] res = new int[r][c];
        for(int i=0;i<m*n;i++){
            res[i/c][i%c]=nums[i/n][i%n];
        }
        return res;
    }
}
// @lc code=end

