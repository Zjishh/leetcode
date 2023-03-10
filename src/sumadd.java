/****************************
 * @project leetcode
 * @package PACKAGE_NAME
 * @className sumadd
 * @author Zjiah
 * @date 2023/3/8 19:39
 * @Description:
 * 给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。
 *
 * 请返回 nums 的动态和。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/running-sum-of-1d-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*
 ****************************/
public class sumadd {


    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6};


        for (int i : a(num)) {
            System.out.println(i);
        }
    }

    private static int[] a(int[] nums) {
        int[] res = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            res[i] = sum;
        }
        return res;
    }
}
