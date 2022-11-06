package doitAlgorithm.search;

import java.util.Arrays;
import java.util.Scanner;

public class 이진탐색_원하는정수찾기029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // N(정렬할 수 개수) M(탐색할 숫자의 개수)
        int n = sc.nextInt();
        int[] arr = new int[n];
        //A(정렬할 배열 선언하기)
        //for(N의 개수만큼 반복하기){
        //    A배열 저장하기
        //}
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        //A배열 정렬하기
        Arrays.sort(arr);
        int m = sc.nextInt();
        //for(M의 개수만큼 반복하기){
        for(int i=0; i<m; i++) {
            boolean find = false;
            //    target(찾아야 하는 수)
            int target = sc.nextInt();
            //    // 이진 탐색 시작
            //    start(시작 인덱스), end(종료 인덱스)
            int start = 0;
            int end = arr.length - 1;
            //        while(시작인덱스 <= 종료 인덱스){
            while (start <= end) {
                //            midi(중간 인덱스)
                int midi = (start + end) / 2;
                int midV = arr[midi];
                //            if(중앙값 > target){
                if(midV > target) {
                    //                종료 인덱스 = 중간 인덱스 -1
                    end = midi -1;
                    //            }
                }
                //            else if(중앙값 < target) {
                else if(midV < target) {
                    //                시작 인덱스 = 중간 인덱스 +1
                    start = midi + 1;
                }
                //            } else {
                else {
                    //                찾았으므로 반복문 종료하기
                    find = true;
                    break;
                    //            }
                }
                //        }
            }
            //    if(찾았음) 1 출력
            if (find) {
                System.out.println(1);
            } else {
                //    else 0 출력
                System.out.println(0);
                //}
            }
        }
    }
}
