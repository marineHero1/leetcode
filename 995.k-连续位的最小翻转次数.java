/*
 * @lc app=leetcode.cn id=995 lang=java
 *
 * [995] K 连续位的最小翻转次数
 */

// @lc code=start
class Solution {
    public int minKBitFlips(int[] A, int K) {
        int len = A.length;
        int res = 0;
        for(int i = 0;i<len;i++){
            if(A[i]==0){
                if(i+K>len){
                    return -1;
                }
                for(int j=0;j<K;j++){
                    A[i+j] ^= 1;
                }
                res+=1;
            }
            
        }
        return res;       
    }
}
// @lc code=end

