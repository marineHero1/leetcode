/*
 * @lc app=leetcode.cn id=54 lang=java
 *
 * [54] 螺旋矩阵
 */

// @lc code=start
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int flag = 0;
        ArrayList<Integer> list = new ArrayList<>();
        int row=0,col=0;
        int rowFlag = 1, colFlag = 1;
        int limit=0;
        while(flag<m*n){
            list.add(matrix[row][col]);
            flag++;
            //右 下 左 上
            if(colFlag == 1 && col<n-limit-1){
                //右
                col+=colFlag;
                continue;
            }
            if(rowFlag == 1 && row<m-limit-1){
                //下
                row+=rowFlag;
                continue;
            }
            if(colFlag == -1 && col>limit-1){
                //左
                col+=colFlag;
                continue;
            }
            if(rowFlag == -1 && row>limit){
                //上
                row+=rowFlag;
                continue;
            }
            if(row == m-limit-1 && col == n-limit-1){
                limit+=1;
                colFlag = -1;
                rowFlag = -1;
                col+=colFlag;
                continue;
            }
            if(row==limit && col == limit-1){
                colFlag = 1;
                rowFlag = 1;
                col+=colFlag;
                continue;
            }
        }
        return list;
    }
}
// @lc code=end

