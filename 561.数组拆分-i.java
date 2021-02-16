/*
 * @lc app=leetcode.cn id=561 lang=java
 *
 * [561] 数组拆分 I
 */

// @lc code=start
class Solution {
    public int arrayPairSum(int[] nums) {
        int res = 0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i+=2){
            res+=nums[i];
        }
        return res;
    }
}
// @lc code=end

