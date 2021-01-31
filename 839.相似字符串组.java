/*
 * @lc app=leetcode.cn id=839 lang=java
 *
 * [839] 相似字符串组
 */

// @lc code=start
class Solution {
    static int[] f;
    public int numSimilarGroups(String[] strs) {
        int len = strs.length;
        int m = strs[0].length();
        f = new int[len];
        for(int x = 0;x<len;x++){
            f[x] = x;
        }
        for(int i = 0;i<len-1;i++){
            for(int j = i+1;j<len;j++){
                int fi = find(i),fj = find(j);
                if(fi == fj){
                    continue;
                }
                if(check(strs[i],strs[j],m)){
                    f[fi]=fj;
                }
            }
        }
        int res=0;
        for(int i = 0;i<len;i++){
            if(f[i] == i){
                res++;
            }
        }
        return res;
    }
    public int find(int x) {
        return f[x]==x ? x : (f[x] = find(f[x]));
    }
    public boolean check(String str1,String str2,int m) {
        int flag = 0;
        for(int i = 0;i<m;i++) {
            if(str1.charAt(i) != str2.charAt(i)){
                flag++;
            }
            if(flag > 2){
                return false;
            }
        }
        if(flag == 1){
                return false;
        }else{
            return true;
        }
    }
}
// @lc code=end

