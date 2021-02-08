/*
 * @lc app=leetcode.cn id=978 lang=java
 *
 * [978] 最长湍流子数组
 */

// @lc code=start
class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int start=0,end=0;
        int len = arr.length;
        if(len<=1){
            return 1;
        }
        int p=0,q=1,flag=1,flag2=0,res=1;
        if(arr[q]>arr[p]){
            flag=1;
            end++;
        }else if(arr[q]<arr[p]){
            flag=-1;
            end++;
        }else{
            end=q;
            start=end;
        }
        res = Math.max(res,end-start+1);
        if(len==2){
            return res;
        }
        //flag=1表示增，flag=-1表示减
        for(int i=2;i<len;i++){
            p=i-1;
            q=i;
            if(arr[q]>arr[p]){
                flag2=1;
            }else if(arr[q]<arr[p]){
                flag2=-1;
            }else{
                res = Math.max(res,end-start+1);
                end=q;
                start=end;
                flag=flag2;
                continue;
            }
            if(flag+flag2==0){
                end++;
            }else{
                end=q;
                start=end-1;
            }
            flag=flag2;
            res = Math.max(res,end-start+1);

            
        }
        return res;
    }
}
// @lc code=end

