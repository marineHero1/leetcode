/*
 * @lc app=leetcode.cn id=480 lang=java
 *
 * [480] 滑动窗口中位数
 */

// @lc code=start
class Solution {
    public double[] medianSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        long[] nums2 = new long[k];
        long[] nums4 = new long[k-1];
        double[] nums3 =new double[len-k+1];
        for(int i=0;i<k;i++){
                nums2[i]=nums[i];
        }
        Arrays.sort(nums2);
        for(int i=0;i<len-k+1;i++) {
            if(k % 2 == 0){
                nums3[i] = (nums2[k/2-1] + nums2[k/2])/2.0;
            }else{
                nums3[i] = nums2[k/2];
            }
            int x=0,y=0,flag=0;
            while(y<k){
                if(nums2[y]==nums[i] && flag==0){
                    y++;
                    flag=1;
                }else{
                    nums4[x]=nums2[y];
                    x++;
                    y++;
                }
            }
            if(i<len-k){
                nums2 = fun(nums4,nums[i+k]);
            }
            
        }
        
        return nums3;
    }
    public static long[] fun(long[] nums,int a){
        int len = nums.length + 1;
        long[] nums2 = new long[len];
        int flag = 0;
        for(int i=0;i<len-1;i++){
            if(flag==0) {
                if (a <= nums[i]) {
                    nums2[i] = a;
                    flag = 1;
                }else {
                    nums2[i] = nums[i];
                }
            }else{
                nums2[i] = nums[i-1];
            }
        }
        if(flag==0){
            nums2[len-1]=a;
        }else{
            nums2[len-1]=nums[len-2];
        }
        return nums2;
    }
}

// @lc code=end

