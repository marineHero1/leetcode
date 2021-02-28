/*
 * @lc app=leetcode.cn id=896 lang=java
 *
 * [896] 单调数列
 */

// @lc code=start
class Solution {
    public boolean isMonotonic(int[] array) {
        int i = 0;
        int j = 0;
        for(int k=0;k<array.length-1;k++){
            if(array[k]<array[k+1]){
                i++;
            }else if(array[k]>array[k+1]){
                j++;
            }
            //两个都不为0，就不是单调数列
            if(i!=0&&j!=0){
                return false;
            }
        }
        return i*j==0;
    }
}
// @lc code=end

