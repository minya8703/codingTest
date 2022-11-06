package doitAlgorithm.search;

import java.util.Scanner;

public class 깊이우선탐색_신기한소수찾기024 {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // n(자릿수)
        n = sc.nextInt();
        // DFS 실행하기(숫자 2, 3, 5, 7로 탐색)
        DFS(2,1);
        DFS(3,1);
        DFS(5,1);
        DFS(7,1);

    }
    // DFS 구현하기
    static void DFS(int number, int jarisu) {
        //
        // DFS {
        //     if(자릿수 == n){
        //         if(소수)수 출력하기
        //         탐색종료
        //     }
        if(jarisu == n){
            if(isPrime(number)){
                System.out.println(number);
            }
            return;
        }
        //     for(1 ~ 9 반복하기){
        //         if(뒤에 붙는 수가 홀수이면서 소수일 때)
        //         DFS 실행 : 자릿수 + 1, 수 * 10 + 뒤에 붙는 수
        //     }
        // }
        for(int i=1; i<10; i++){
            if(i % 2 == 0){
                continue;
            }
            if(isPrime(number * 10 + i)){
                DFS(number * 10 +i, jarisu +1);
            }
        }

    }
    static boolean isPrime(int num){
        // //소수 구하기 함수
        // for('2 ~ 현재 수 / 2' 반복하기){
        //     if(나머지가 0이면) {
        //         return 소수가 아님
        //     }
        for(int i=2; i<=num/2; i++){
            if(num % i == 0){
                return false;
            }
        }
        // }
        // return 소수임
        return true;

    }
}
