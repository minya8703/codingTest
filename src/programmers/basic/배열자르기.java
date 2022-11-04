package programmers.basic;
import java.util.*;
public class 배열자르기 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int num1 = 1;
        int num2 = 3;
        System.out.println(Arrays.toString(solution(numbers, num1, num2)));

    }
    public static int[] solution(int[] numbers, int num1, int num2) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(numbers);
        for(int i=0; i<numbers.length; i++){
            System.out.println("numbers["+i+"]"+numbers[i]);
            if(i>=num1 && i<=num2) {
                answer.add(numbers[i]);
            }
        }
        return answer.stream()
                .mapToInt(i -> i)
                .toArray();
    }
}
