package Arraysandstrings;

/****************************
 * @project leetcode
 * @package Arraysandstrings
 * @className T8
 * @author Zjiah
 * @date 2023/8/1 17:06
 * @Description: 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。 *
 ****************************/
public class T8 {
    public static void main(String[] args) {
            int[] nums = {0,0,1,0,2,2,3,0,666,0};
        if (nums == null) {
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                for (int i1 = i + 1; i1 < nums.length; i1++) {
                    if (nums[i1] != 0) {
                        int temp = nums[i1];
                        nums[i1] = 0;
                        nums[i] = temp;
                        break;
                    }
                }
            }
        }
        for (int num : nums) {
            System.out.println(num);
        }


    }
}
