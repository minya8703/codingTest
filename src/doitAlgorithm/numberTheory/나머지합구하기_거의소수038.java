package doitAlgorithm.numberTheory;

import java.util.Scanner;

public class 나머지합구하기_거의소수038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Min(시작수)  Max(종료수)
        long min = sc.nextLong();
        long max = sc.nextLong();
        // arr(소수배열)
        long[] arr = new long[10000001];
        for(int i = 2; i<arr.length; i++) {
            arr[i] = i;
        }
        // for(10000000의 제곱근까지 반복하기) {
        for(int i = 2; i<= Math.sqrt(arr.length); i++) {
            //     소수가 아니면 넘어감
            if(arr[i] == 0){
                continue;
            }
            //     for(소수 배숫값을 10000000까지 반복하기){
            for(int j= i+i; j<arr.length; j = j +i) {
                //         이 수가 소수가 아니라는 것을 표시하기
                arr[j] = 0;
                //     }
                // }
            }
        }
        int count = 0;
        // for(2~10000000){
        for(int i=2; i<10000001; i++) {
            //     arr배열에서 소수인 값일 때
            if(arr[i] != 0) {
                //     temp = 현재 소수
                long temp = arr[i];
                //     // 현재 소수의 제곱근이 Max보다 작을 때를 기준으로 하지만
                //     // 곱셈이 long의 범위를 넘어갈 수 있어 이항 정리로 처리하기
                //     while(현재 소수 <= Max/temp){
                while ((double)arr[i] <= (double) max / (double)temp) {
                    //         if(현재 소수 >= min/temp) 정답값 증가
                    if((double) arr[i] >= (double)min / (double)temp) {
                        count++;
                    }
                        //         temp = temp * 현재 소수
                    temp = temp * arr[i];
                        //     }
                        // }

                }
            }
        }
        // 정답 출력하기
        System.out.println(count);
    }
}
