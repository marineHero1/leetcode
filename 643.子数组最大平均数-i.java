/*
 * @lc app=leetcode.cn id=643 lang=java
 *
 * [643] 子数组最大平均数 I
 */

// @lc code=start
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max = 0.0,sum = 0.0;
        int len = nums.length;
        for(int i=0;i<k;i++){
            sum += nums[i];
        }
        max = sum;
        for(int i=1;i<len-k+1;i++){
            sum = sum - nums[i-1] + nums[i+k-1];
            max = max>sum?max:sum;
        }
        return max/k;
    }
}
// @lc code=end

