import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class 가장큰수 {
    public static void main(String[] args){
        int[] num1 = {6, 10, 2};
        int[] num2 = {3, 30, 34, 5, 9};
        System.out.println(solution(num1));
        System.out.println(solution(num2));


    }
    public static String solution(int[] numbers) {
        String[] nums = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++)
            nums[i] = numbers[i] + "";

        Arrays.sort(nums, (n1, n2) -> (n2 + n1).compareTo(n1 + n2));
        return nums[0].equals("0") ? "0" : Arrays.stream(nums).collect(Collectors.joining());
    }
}
