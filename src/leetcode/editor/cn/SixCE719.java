package leetcode.editor.cn;
/**
 * @author [你的昵称或名字]
 * 2024-06-21 20:42:27  // 生成当前你做题的时间
 */
public class SixCE719 {
  public static void main(String[] args) {
       Solution solution = new SixCE719().new Solution();
      // 测试用例1
      int[] temperatureA1 = {21, 18, 18, 18, 31};
      int[] temperatureB1 = {34, 32, 16, 16, 17};
      int result1 = solution.temperatureTrend(temperatureA1, temperatureB1);
      System.out.println("测试用例1输出：" + result1);

      // 可以添加更多的测试用例
      
  }
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int temperatureTrend(int[] temperatureA, int[] temperatureB) {
        int[] A = new int[temperatureA.length - 1];
        int[] B = new int[temperatureB.length - 1];
        for (int i = 0; i < temperatureA.length - 1; i++){
            if (temperatureA[i + 1] > temperatureA[i]){
                A[i] = 1;
            } else if (temperatureA[i + 1] < temperatureA[i]){
                A[i] = -1;
            } else {
                A[i] = 0;
            }
        }

        for (int i = 0; i < temperatureB.length - 1; i++){
            if (temperatureB[i + 1] > temperatureB[i]){
                B[i] = 1;
            } else if (temperatureB[i + 1] < temperatureB[i]){
                B[i] = -1;
            } else {
                B[i] = 0;
            }
        }

        int result = 0;
        int count = 0;
        int[] C = new int[A.length];

        for (int i = 0; i < A.length; i++){
            if (A[i] == B[i]){
                C[i] = 1;
            } else {
                C[i] = 0;
            }
        }

        for (int i = 0; i < C.length; i++){
            if (C[i] == 0){
                continue;
            }
            for (int j = i; j< C.length; j++){
                if (C[j] == 0){
                    break;
                }
                count++;
            }
            if (count > result){
                result = count;
            }
            count = 0;
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
