package programmers.linearSearch;

public class 문자열내p와y의개수 {
    public static void main(String[] args) {
        String s = "pPoooyY";
        System.out.println(solution(s));
        String s1 = "Pyy";
        System.out.println(solution(s1));
        System.out.println("결과 2");
        System.out.println(solution1(s));
        System.out.println(solution1(s1));
    }
    static boolean solution(String s) {
        String s2 = s.toLowerCase();
        int p = 0;
        for(char c : s2.toCharArray()) if(c == 'p') p++;
        for(char c : s2.toCharArray()) if(c == 'y') p--;
        return p==0;
    }
    static boolean solution1(String s) {
        int p = s.replaceAll("[^pP]", "").length();
        int y = s.replaceAll("[^yY]", "").length();
        return p == y;
    }
}
