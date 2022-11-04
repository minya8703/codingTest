package programmers.basic;

public class 합성수찾기 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(solution(n));

    }
    public static int solution(int n) {
        int answer = 0;
        for(int i = 1 ; i <= n; i ++) {
            if(compositeNum(i)){
                answer++;
            }
        }
        return answer;
    }
    public static boolean compositeNum(int num) {
        int count = 0;
        for(int i = 1 ; i <= (num/2) ; i ++) {
            if(num%i == 0) {
                count++;
            }
        }
        return count >= 2 ? true : false;
    }
}
