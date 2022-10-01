package programmers.list;

import java.util.*;

public class 자연수뒤집어배열로만들기 {
    public static void main(String[] args){
        long n = 12345;
        System.out.println(Arrays.toString(solution(n)));
        System.out.println("멘토 결과");
        System.out.println(Arrays.toString(solutionMt(n)));
    }
    public static int[] solution(long n) {
        String str = String.valueOf(n);
        int[] answer = new int[str.length()];
        for(int i=str.length()-1;i>=0;i--) {//뒤집어서 입력
            answer[str.length()-1-i] = str.charAt(i)-'0';
        }
        return answer;
    }
    public static int[] solutionMt(long n) {
        List<Integer> list = new LinkedList<>();
        while (n>0) {
            list.add((int)(n%10));
            n/=10;
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
