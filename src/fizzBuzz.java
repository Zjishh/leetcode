import java.util.ArrayList;
import java.util.List;

/****************************
 * @project leetcode
 * @package PACKAGE_NAME
 * @className fizzBuzz
 * @author Zjiah
 * @date 2023/3/9 12:20
 * @Description:   *
 ****************************/
public class fizzBuzz {
    public static void main(String[] args) {
        int i = 10;
        System.out.println(fizzBuzz1(i));
    }

    private static List<String> fizzBuzz1(int n) {
        List<String> res = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            StringBuffer s = new StringBuffer();
            if (i % 3 == 0 && i % 5 == 0) {
                s.append("FizzBuzz");
            } else if (i % 3 == 0) {
                s.append("Fizz");
            } else if (i % 5 == 0) {
                s.append("Buzz");
            } else {
                s.append(i);
            }
            res.add(s.toString());
        }


        return res;

    }
}
