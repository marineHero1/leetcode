/*
 * @lc app=leetcode.cn id=1052 lang=java
 *
 * [1052] 爱生气的书店老板
 */

// @lc code=start
class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int len = customers.length;
        int[] nums = new int[len];
        int res=0;
        for(int i=0;i<len;i++){
            nums[i]=customers[i]*grumpy[i];
            res += customers[i]*(grumpy[i]^1);
        }
        //nums滑动窗口求最大值，窗口长度为X
        int max=nums[0],sum=nums[0],i=0,j=0;
        while(j<len){
            if(j-i+1<X){
                j++;
            }else{
                sum -= nums[i];
                i++;
                j++;
                if(j>=len){
                    break;
                }
            }
            sum += nums[j];
            max = Math.max(sum,max);
        }
        return res+max;

    }
}
// @lc code=end

