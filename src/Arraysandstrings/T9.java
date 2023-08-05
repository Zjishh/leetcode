package Arraysandstrings;

import java.util.HashMap;
import java.util.Map;

/****************************
 * @project leetcode
 * @package Arraysandstrings
 * @className T9
 * @author Zjiah
 * @date 2023/8/2 23:07
 * @Description:   *
 ****************************/
public class T9 {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        System.out.println(a(nums));


    }

    private static int a(int[] nums) {

        Map<Integer, Integer> objectObjectHashMap = new HashMap<>();

        for (int num : nums) {
            if (!objectObjectHashMap.containsKey(num)) {
                objectObjectHashMap.put(num, 0);
            } else {
                int i = objectObjectHashMap.get(num) + 1;
                if (i > nums.length / 2) {
                    return num;
                }
                objectObjectHashMap.put(num, i);
            }
        }


//        for (int i = 0; i < nums.length; i++) {
//
//            for (int p = 0; p < nums.length; p++) {
//
//                if (nums[i] == nums[p] && p != i){
//                    break;
//                }
//                if (p == nums.length-1){
//                    return nums[i];
//                }
//
//
//            }
//        }
        return -1;
    }
}
