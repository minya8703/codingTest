package programmers.list;

import java.util.*;

public class 순열검사 {
    public static void main(String[] args){
        // 입력이 [4, 1, 3, 2]가 주어진 경우, 배열의 길이가 4이므로 배열에는
        // 1부터 4까지 숫자가 모두 들어 있어야 합니다. [4, 1, 3, 2]에는
        // 1부터 4까지의 숫자가 모두 들어 있으므로 true를 반환하면 됩니다.
        int[] arr = {4, 1, 3, 2};
        // [4, 1, 3]이 주어진 경우, 배열의 길이가 3이므로 배열에는
        // 1부터 3까지 숫자가 모두 들어 있어야 합니다. [4, 1, 3]에는
        // 2가 없고 4가 있으므로 false를 반환하면 됩니다.
        int[] arr1 = {4, 1, 3};
        System.out.println(solution(arr));
        System.out.println(solution(arr1));
        System.out.println("멘토님 결과");
        System.out.println(solutionMt(arr));
        System.out.println(solutionMt(arr1));

    }
    public static boolean solution(int[] arr) {
        boolean answer = true;
        Arrays.sort(arr);
        for(int i=0;i<arr.length; i++){
            if(i+1 != arr[i]){
                answer = false;
            }
        }
        return answer;
    }
    public static boolean solutionMt(int[] arr) {
        // n : 1~n
        int[] answer = new int[arr.length];
        for(int i = 0; i<arr.length; i++) answer[i] = i+1;
        Arrays.sort(arr);
        return Arrays.equals(answer, arr);
    }
}
