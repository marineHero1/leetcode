/*
 * @lc app=leetcode.cn id=697 lang=java
 *
 * [697] 数组的度
 */

// @lc code=start
class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,int[]> h = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(h.containsKey(nums[i])){
                h.get(nums[i])[0]++;//数组索引
                h.get(nums[i])[2] = i;
            }else{
                //三位数组，第一位是数量，第二位是起始位置，第三位是末尾位置
                h.put(nums[i],new int[]{1,i,i});
            }
        }
        int max = 0;
        int res = 50001;
        for(int[] i:h.values()){
            if(i[0]>max){
                max = i[0];
                res = i[2]-i[1]+1;
            }
            if(i[0]==max){
                res = Math.min(i[2]-i[1]+1,res);
            }
        }
        return res;
    }
}
// @lc code=end

