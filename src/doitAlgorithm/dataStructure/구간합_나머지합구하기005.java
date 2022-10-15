package doitAlgorithm.dataStructure;

import java.util.Scanner;

public class 구간합_나머지합구하기005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // N 입력받기 (수열의 개수)
        int n = sc.nextInt();
        // M 입력받기 (나누어 떨어져야 하는 수)
        int m = sc.nextInt();
        // S 선언하기 (합배열)
        long[] sArr = new long[n];
        // C 선언하기 (같은 나머지의 인덱스를 카운트하는 배열)
        long[] cArr = new long[m];
        long answer = 0;
        sArr[0] = sc.nextInt();
        // for(i →　1 ~ 1) {
        //     S[i] = S[i - 1] + A[i] // 합배열 저장
        // }
        for(int i=1; i<n; i++){
            sArr[i] = sArr[i-1] + sc.nextInt();

        }
        // for(i →　0 ~ N) {
        //     remainder = S[i] % M // 합배열을 M으로 나눈 나머지 값
        //     if(remainder == 0) 정답을 1 증가 시키기
        //     C[remainder]의 값을 1 증가 시키기
        // }
        for(int i=0; i<n; i++){
            int remainder = (int) (sArr[i] % m);
            // 0~i까지의 구간 합 자체가 0일때 정답에 더하기
            if(remainder == 0) answer++;
            // 나머지가 같은 인덱스의 개수 카운팅하기
            cArr[remainder]++;
        }
        // for(i →　0 ~ M) {
        //     C[i](i가 나머지인 인덱스의 개수)에서 2가지를 뽑는 경우의 수를 정답에 더하기
        //     // C[i]개 중 2개를 뽑는 경우의 수 계산 공식 C[i] * (C[i] - 1) / 2
        // }
        for(int i=0;i<m;i++){
            if(cArr[i] > 1){
                // 나머지가 같은 인덱스 중 2개를 뽑는 경우의 수를 더하기
                answer = answer + (cArr[i] * (cArr[i] - 1)/2);

            }
        }
        System.out.println(answer);
        //결괏값 출력
    }
}
