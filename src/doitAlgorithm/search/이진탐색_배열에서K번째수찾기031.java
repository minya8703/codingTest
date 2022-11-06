package doitAlgorithm.search;

import java.util.Scanner;

public class 이진탐색_배열에서K번째수찾기031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //N(배열의 크기) K(구하고자 하는 index)
        int n = sc.nextInt();
        int k = sc.nextInt();
        //start(시작 인덱스 = 1)
        long start = 1;
        //end(종료 인덱스 = K)
        long end = k;
        long ans = 0;
        //while(시작 인덱스 <= 종료 인덱스){// 이진 탐색 수행하기
        while (start<=end) {
            //    middle(중간 인덱스)
            long middle = (start + end) /2;
            //    cnt(중앙값보다 작은 수)
            long cnt = 0;
            //    // 중앙값보다 작은 수는 몇 개인지 계산하기
            //    for(N의 개수만큼 반복하기){
            //       cnt에 중앙 인덱스를 i로 나눈 값과 N중 작은 값을 더함
            //    }
            for(int i=1; i<=n; i++){
                cnt += Math.min(middle / i, n);
            }
            //    if(cnt < K : 현재 중앙값보다 작은 수의 개수가 K보다 작음)
            if(cnt < k) {
                //        시작 인덱스 = 중앙 인덱스 + 1
                start = middle + 1;
                //    else(현재 중앙값보다 작으 수의 개수가 K보다 크거나 같음)
            } else {
                //        정답 변수에 중앙값 저장
                ans = middle;
                //        종료 인덱스 = 중앙 인덱스 + 1
                end = middle - 1;
                //}
            }
        }
        //정답 출력
        System.out.println(ans);
    }
}
