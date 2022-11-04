package programmers.basic;
import java.util.*;
public class 소인수분해 {
    public static void main(String[] args) {

        int n = 420;
        System.out.println(Arrays.toString(solution(n)));
    }
    public static long[] solution(int n) {
        Set<Integer> set = new HashSet<>();
        int i = 2;
        //n이 1이 될 때까지 반복
        while (n != 1) {
            // i가 n의 약수이면 나누고 출력
            if (n % i == 0) {
                n/= i;
                set.add(i);
            } else {
                i++;
            }
        }
        long[] answer = new long[set.size()];
        answer = set.stream().mapToLong(j -> j).toArray();
        return answer;
    }
}
