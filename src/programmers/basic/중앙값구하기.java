package programmers.basic;

import java.util.Arrays;

public class 중앙값구하기 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 7, 10, 11};
        int[] arr1 = {9, -1, 0};
        System.out.println(solution(arr));
        System.out.println(solution(arr1));

    }
    public static int solution(int[] array) {
        Arrays.sort(array);
        int index = (array.length/2)+1;
        System.out.println(index);
        int answer = array[index];
        return answer;
    }
}
