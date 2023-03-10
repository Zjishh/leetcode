package Arraysandstrings;

/****************************
 * @project leetcode
 * @package Arraysandstrings
 * @className T1
 * @author Zjiah
 * @date 2023/3/10 16:50
 * @Description: 给你一个整数数组 nums ，请计算数组的 中心下标 。
 *
 * 数组 中心下标 是数组的一个下标，其左侧所有元素相加的和等于右侧所有元素相加的和。
 *
 * 如果中心下标位于数组最左端，那么左侧数之和视为 0 ，因为在下标的左侧不存在元素。这一点对于中心下标位于数组最右端同样适用。
 *
 * 如果数组有多个中心下标，应该返回 最靠近左边 的那一个。如果数组不存在中心下标，返回 -1 。
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode.cn/leetbook/read/array-and-string/yf47s/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。*
 ****************************/
public class T1 {
    public static void main(String[] args) {
        int[] s = {2, 1, -1};
        pivotIndex(s);
    }
    public static int pivotIndex(int[] nums) {
        int sum = 0,sum2 = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

        }
        System.out.println(sum);
        for (int i = 0; i < nums.length; i++) {
            sum2 += nums[i];
            if (sum-sum2==sum2-nums[i]){
                System.out.println(i);
                return i;
            }

        }



        return -1;
    }
}
