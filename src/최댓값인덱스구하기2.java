import java.util.Arrays;
import java.util.stream.*;

public class 최댓값인덱스구하기2 {
    public static void main(String[] args){
        int[] arr = {1, 3, 5, 4, 5, 2, 1};
        System.out.println(Arrays.toString(solution(arr)));
        int[] arr1 = {3, 6, 10, 1, 7, 2, 4, 6, 10, 9};
        System.out.println(Arrays.toString(solution(arr1)));
    }
    public static int[] solution(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        return IntStream.range(0, arr.length).filter(i->arr[i] == max).toArray();
    }
}
