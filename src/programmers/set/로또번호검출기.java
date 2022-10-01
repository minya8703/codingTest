package programmers.set;

import java.util.*;

public class 로또번호검출기 {
    public static void main(String[] args){
        int[] lotto = {4, 7, 32, 43, 22, 19};
        int[] lotto1 = {3, 19, 34, 39, 39, 20};
        System.out.println(solution(lotto));
        System.out.println(solution(lotto1));
        System.out.println("2번째 방법");
        System.out.println(solution1(lotto));
        System.out.println(solution1(lotto1));
    }
    public static boolean solution(int[] lotto) {
        boolean[] checker = new boolean[45+1];
        for(int num: lotto) {
            if(num < 1 || num > 45){
                return false;
            }
            if(checker[num]){
                return false;
            }
            checker[num] = true;
        }
        return true;
    }
    public static boolean solution1(int[] lotto) {
        Set<Integer> set = new HashSet<>();
        for(int num: lotto) {
            if(num < 1 || num > 45){
                return false;
            }
            set.add(num);
        }
        return set.size() == lotto.length;
    }
}
