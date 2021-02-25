/*
 * @lc app=leetcode.cn id=15 lang=java
 *
 * [15] 三数之和
 */

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(len<=2){
            return res;
        }
        int i=0,left=0,right=len-1;
        int local=0,localSum=0;
        for(;i<len-2;i++){
            if(nums[i]>0) return res;
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            left=i+1;
            right=len-1;
            local=-nums[i];
            while(left<right){
                localSum = nums[left]+nums[right];
                if(localSum==local){
                    res.add(new ArrayList<>(Arrays.asList(-local,nums[left],nums[right])));
                    //list.clear();二维列表存储地址，清空后内容就没有了,必须每次new一个List
                    left++;
                    right--;
                    while(left<right && nums[left]==nums[left-1]){
                        left++;
                    }
                    while(left<right && nums[right]==nums[right+1]){
                        right--;
                    }
                }else if(localSum>local){
                    right--;
                }else{
                    left++;
                }
            }
        }
        return res;
    }
}
// @lc code=end

