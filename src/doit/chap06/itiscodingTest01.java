package doit.chap06;

import java.util.Arrays;
import java.util.Collections;

public class itiscodingTest01 {
    // 위에서 아래로

    public static void main(String[] args) {
        int[] nums = {15, 27, 12};
        System.out.println(Arrays.toString(arraySort(nums)));

    }

    private static int[] arraySort(int[] nums) {
        int[] a = nums;
        //int[] - > Integer[]
        Integer[] conv = Arrays.stream(a).boxed().toArray(Integer[]::new);

        Arrays.sort(conv, Collections.reverseOrder());
        //Integer[]  -> int[]
        a = Arrays.stream(conv).mapToInt(Integer::intValue).toArray();
        return a;
    }
}
