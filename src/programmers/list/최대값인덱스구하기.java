package programmers.list;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 최대값인덱스구하기 {
    public static void main(String[] args){
        int[] arr = {1, 3, 5, 4, 5, 2,1};
        System.out.println(Arrays.toString(solution(arr)));
        System.out.println(Arrays.toString(solutionMt(arr)));
    }
    public static int[] solution(int[] arr){
        int num = arr[0];
        int cnt = 0;
        for (int number : arr) {
            if (number > num) {
                num = number;
            }
        }
        for (int number : arr) {
            if (number == num) {
                cnt++;
            }
        }
        int[] answer = new int[cnt];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                answer[j++] = i;
            }
        }
        return answer;
    }
    public static int[] solutionMt(int[] arr){
        // 최대값 구하기
        int max = Arrays.stream(arr).max().getAsInt();
        // 최대값이 몇개인지 확인하기
        // 배열 만들기
        // 배열 인덱스 채우기
        return IntStream.range(0, arr.length).filter(i-> arr[i] == max).toArray();

    }
}
