/*
 * @lc app=leetcode.cn id=1208 lang=java
 *
 * [1208] 尽可能使字符串相等
 */

// @lc code=start
class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int num1 = s.length();
        int num2 = t.length();
        int num = Math.min(num1,num2);
        int[] nums = new int[num];
        for(int i=0;i<num;i++){
            nums[i] = Math.abs(s.charAt(i)-t.charAt(i));

        }
        int res = 0,sum = 0;
        int start =0,localRes = 0;
        for(int end = 0; end < num; end++){
            sum += nums[end];
            if(sum > maxCost){
                sum -= nums[start];
                start++;
            }
            localRes = end - start + 1;
            res = localRes>res?localRes:res;
        }
        return res;
    }
}
// @lc code=end

