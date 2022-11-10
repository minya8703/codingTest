package doitAlgorithm.numberTheory;

import java.util.Scanner;

public class 소수구하기_소수구하기037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // M(시작 수) N(종료 수)
        int m = sc.nextInt();
        int n = sc.nextInt();
        // A(소수 배열)
        int[] arr = new int[n + 1];
        // for(N만큼 반복하기){
        //     A배열 초기화 하기 // 각각의 인덱스값으로 초기화 하기
        // }
        for(int i = 2; i<=n; i++){
            arr[i] = i;
        }
        // for(N의 제곱근 까지 반복하기){
        for(int i=2; i<=Math.sqrt(n); i++) {
            //     소수가 아니면 넘어감
            if(arr[i] == 0) {
                continue;
            }
            //     for(소수의 배수 값을 N까지 반복하기){
            for(int j=i+i; j<=n; j = j+i) {// 배수 지우기
                //         이 수가 소수가 아니라는 것을 표시하기
                arr[j] = 0;
                //     }
                // }
            }
        }
        // for(M ~ N까지 반복하기) {
        for(int i=m; i<=n; i++) {
            //     A배열에서 소수인 값 출력하기
            if(arr[i] != 0){
                System.out.println(arr[(int)i]);
            }
            // }
        }
    }
}
