package Arraysandstrings;

/****************************
 * @project leetcode
 * @package Arraysandstrings
 * @className Arr
 * @author Zjiah
 * @date 2023/3/10 17:06
 * @Description:   *
 ****************************/
public class Arr {
    int[] arr = {1,2,3,5,6,9};

    public Arr() {
    }

    public Arr(int[] arr) {
        this.arr = arr;
    }

    /**
     * 获取
     * @return arr
     */
    public int[] getArr() {
        return arr;
    }

    /**
     * 设置
     * @param arr
     */
    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public String toString() {
        return "Arr{arr = " + arr + "}";
    }
}
