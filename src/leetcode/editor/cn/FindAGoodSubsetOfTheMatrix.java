package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * @author [你的昵称或名字]
 * 2024-06-25 11:21:48  // 生成当前你做题的时间
 */
public class FindAGoodSubsetOfTheMatrix {
  public static void main(String[] args) {
       Solution solution = new FindAGoodSubsetOfTheMatrix().new Solution();
       //测试用例1
       //System.out.println("测试用例1输出：" + result);
       //测试用例2
       //System.out.println("测试用例2输出：" + result);
  }
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> goodSubsetofBinaryMatrix(int[][] grid) {

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < grid.length; i++) {
            boolean onlyZero = true;
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1){
                    onlyZero = false;
                }
            }
            if (onlyZero){
                return List.of(i);
            }
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = i + 1; j < grid.length; j++) {
                boolean notDoubleOne = true;
                for (int k = 0; k < grid[i].length; k++) {
                    if (grid[i][k] == 1 && grid[j][k] == 1){
                        notDoubleOne = false;
                    }
                }

                if (notDoubleOne){
                    return List.of(i,j);
                }
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
