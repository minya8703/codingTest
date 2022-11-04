package programmers.basic;

import java.util.Arrays;

public class 최댓값만들기_1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(solution(numbers));
        int[] numbers1 = {0, 31, 24, 10, 1, 9};
        System.out.println(solution(numbers1));

    }
    public static int solution(int[] numbers) {

        Arrays.sort(numbers);
        return numbers[numbers.length-2] * numbers[numbers.length-1];
    }
}
