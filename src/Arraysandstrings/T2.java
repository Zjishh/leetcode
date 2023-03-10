package Arraysandstrings;

/****************************
 * @project leetcode
 * @package Arraysandstrings
 * @className T2
 * @author Zjiah
 * @date 2023/3/10 17:05
 * @Description:
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 请必须使用时间复杂度为 O(log n) 的算法。
 *
 *  
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode.cn/leetbook/read/array-and-string/cxqdh/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。*
 ****************************/
public class T2 extends Arr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 9};


        System.out.println(  searchInsert(arr, 100));

    }

    private static int searchInsert(int[] arr, int target) {
        int i = 0;
        for (i = 0; i < arr.length; i++) {

            if (arr[i] >= target) {

                return i;
            }
        }

        return arr.length;
    }


}
