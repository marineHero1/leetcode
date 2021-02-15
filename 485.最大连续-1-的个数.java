/*
 * @lc app=leetcode.cn id=485 lang=java
 *
 * [485] 最大连续1的个数
 */

// @lc code=start
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res=0,max=0;
        for(int i:nums){
            if(i==1){
                max += 1;
            }else{
                res = Math.max(res,max);
                max = 0;
            }
            
        }
        res = Math.max(res,max);
        return res;
    }
}
// @lc code=end

