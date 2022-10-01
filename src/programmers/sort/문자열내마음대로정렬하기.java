package programmers.sort;

import java.util.Arrays;

public class 문자열내마음대로정렬하기 {
    public static void main(String[] args) {
        String[] strings = {"sun", "bed", "car"};
        int n = 1;
        System.out.println(Arrays.toString(solution(strings, n)));
        String[] strings1 = {"abce", "abcd", "cdx"};
        int n1 = 2;
        System.out.println(Arrays.toString(solution(strings1, n1)));
    }

    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (s1, s2) -> {
            if(s1.charAt(n)  == s2.charAt(n)) {
                return s1.compareTo(s2);
            }
            return s1.charAt(n) - s2.charAt(n);
        });
        return strings;
    }
}
