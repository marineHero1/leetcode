/*
 * @lc app=leetcode.cn id=765 lang=java
 *
 * [765] 情侣牵手
 */

// @lc code=start
class Solution {
    public int minSwapsCouples(int[] row) {
        int len = row.length;
        int res=0;
        for(int i=0;i<len;i+=2){
            int friendIndex=0;
            int med = 0;
            //只给i的位置找情人,让i+1变成Ta的情人
            if(row[i]%2==0){
                if(row[i]+1 == row[i+1]){
                    //偶数的情人比自己大1，说明旁边就是情人不操作
                    continue;
                }
                //找情人换位置
                friendIndex = findFriend(row,row[i]+1);
                med = row[friendIndex];
                row[friendIndex] = row[i+1];
                row[i+1] = med;
                res+=1;
            }else{
                if(row[i] == row[i+1]+1){
                    //奇数的情人比自己小1，说明旁边就是情人不操作
                    continue;
                }
                //找情人换位置
                friendIndex = findFriend(row,row[i]-1);
                med = row[friendIndex];
                row[friendIndex] = row[i+1];
                row[i+1] = med;
                res+=1;
            }
        }
        return res;
    }
    //找到情人x的索引位置
    public int findFriend(int[] row,int x){
        for(int i=0;i<row.length;i++){
            if(row[i]==x){
                return i;
            }
        }
        return -1;
    }
}
// @lc code=end

