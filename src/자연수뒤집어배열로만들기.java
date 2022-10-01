import java.util.*;
import java.util.stream.Stream;

public class 자연수뒤집어배열로만들기 {
    public static void main(String[] args){
        long n = 12345;
        System.out.println(Arrays.toString(solution(n)));
    }
    public static int[] solution(long n) {
        String str = String.valueOf(n);
        int[] answer = new int[str.length()];
        for(int i=str.length()-1;i>=0;i--) {//뒤집어서 입력
            answer[str.length()-1-i] = str.charAt(i)-'0';
        }
        return answer;
    }
}
