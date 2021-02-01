/*
 * @lc app=leetcode.cn id=888 lang=java
 *
 * [888] 公平的糖果交换
 */

// @lc code=start
class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sum1 = 0;
        int sum2 = 0;
        int[] res = {0, 0}; 
        for(int i:A){
            sum1 += i;
        }
        for(int i:B){
            sum2 += i;
        }
        int deep = (sum1 - sum2)/ 2;
        Set<Integer> rec = new HashSet<Integer>();
        for(int x : A){
            rec.add(x);
        }
        for(int y : B){
            int x = y + deep;
            if(rec.contains(x)){
                res[0] = x;
                res[1] = y;
                break;
            }
            
        }
        return res;
    }
}
// @lc code=end

