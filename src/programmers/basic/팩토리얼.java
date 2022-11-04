package programmers.basic;

public class 팩토리얼 {
    public static void main(String[] args) {
        int n = 3628800;
        int n1 = 7;
        System.out.println(solution(n));
        System.out.println(solution(n1));
    }
    public static int solution(int n) {
        int answer = 0;
        for(int i = 1 ; i <= 10; i++) {
            // n이 i의 팩토리얼보다 크다면 진행하여 최대 i를 구함
            if(n >= factorial(i)) {
                answer = i;
                continue;
            } else {
                break;
            }
        }
        return answer;
    }
    private static int factorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
}
