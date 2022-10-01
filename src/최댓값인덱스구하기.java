import java.util.Arrays;

public class 최댓값인덱스구하기 {
    public static void main(String[] args){
        int[] arr = {1, 3, 5, 4, 5, 2, 1};
        System.out.println(Arrays.toString(solution(arr)));
        int[] arr1 = {3, 6, 10, 1, 7, 2, 4, 6, 10, 9};
        System.out.println(Arrays.toString(solution(arr1)));
    }
    public static int[] solution(int[] arr) {
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
}
