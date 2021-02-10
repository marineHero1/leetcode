/*
 * @lc app=leetcode.cn id=567 lang=java
 *
 * [567] 字符串的排列
 */

// @lc code=start
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] array1=new int[26];
        int[] array2=new int[26];
        int len1 = s1.length();
        int len2 = s2.length();
        if(len1>len2){
            return false;
        }
        if(len1==0){
            return true;
        }
        for(int i=0;i<len1;i++){
            array1[s1.charAt(i)-'a']++;
            array2[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(array1,array2)){
            return true;
        }
        for(int i=len1;i<len2;i++){
            array2[s2.charAt(i)-'a']++;
            array2[s2.charAt(i-len1)-'a']--;
            if(Arrays.equals(array1,array2)){
            return true;
            }
        }
        return false;
    }
}
// @lc code=end

