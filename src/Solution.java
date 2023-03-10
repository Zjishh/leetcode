/****************************
 * @project leetcode
 * @package PACKAGE_NAME
 * @className Solution
 * @author Zjiah
 * @date 2023/3/8 19:53
 * @Description:   
 * 给你一个非负整数 num ，请你返回将它变成 0 所需要的步数。 如果当前数字是偶数，你需要把它除以 2 ；否则，减去 1 。
 *
 *  *
 ****************************/
public class Solution {
    public static void main(String[] args) {
        int i =123;
        System.out.println(a(i));
    }

    private static int  a(int num) {
        int flot = 0;
        while (num>1){


            if (num%2==1){
                num-=1;
                System.out.println(num);
            }else {
                  num/=2;
                System.out.println(num);
            }
            flot++;
        }
        if(num==1){
            flot++;

        }

        System.out.println("zuihou"+num);
        return flot;
    }

}
