package leetcode.editor.cn;
/**
 * @author [你的昵称或名字]
 * 2024-06-25 00:51:30  // 生成当前你做题的时间
 */
public class NextGreaterElementIi {
  public static void main(String[] args) {
       Solution solution = new NextGreaterElementIi().new Solution();
       //测试用例1
       //System.out.println("测试用例1输出：" + result);
       //测试用例2
       //System.out.println("测试用例2输出：" + result);
  }
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int max = -1;
            int flag = 0;
            for (int j = i + 1; j < nums.length; j++){
                if (nums[j] > nums[i]){
                    max = nums[j];
                    flag = 1;
                    break;
                }
            }
            if (flag == 0){
                for (int j = 0; j < i; j++){
                    if (nums[j] > nums[i]){
                        max = nums[j];
                        break;
                    }
                }
            }
            res[i] = max;
        }
        return res;

    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
