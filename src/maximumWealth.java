/****************************
 * @project leetcode
 * @package PACKAGE_NAME
 * @className maximumWealth
 * @author Zjiah
 * @date 2023/3/8 20:28
 * @Description:   *
 ****************************/
public class maximumWealth {
    public static void main(String[] args) {
        int[][] s = {{1, 5}, {7, 3}, {3, 5}};

        System.out.println(maximum(s));
    }

    private static int maximum(int[][] maximumWealth) {
        int sum = 0;
        int sum1 = 0;
        int flot = 10;
        for (int j = 0; j < maximumWealth[0].length; j++) {
            sum1 += maximumWealth[0][j];
            System.out.println(sum1);

        }
        for (int i = 0; i < maximumWealth.length; i++) {
            System.out.println();
            sum = 0;

            for (int j = 0; j < maximumWealth[i].length; j++) {

                sum += maximumWealth[i][j];

            }
            System.out.println(sum + "*-*-*-");
            if (sum1 < sum) {
                sum1 = sum;
            }
        }


        return sum1;
    }

}
