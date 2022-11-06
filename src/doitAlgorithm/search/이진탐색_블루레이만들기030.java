package doitAlgorithm.search;

import java.util.Scanner;

public class 이진탐색_블루레이만들기030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // N(레슨 개수) M(블루레이 개수)
        int n = sc.nextInt();
        int m = sc.nextInt();
        //A(정렬할 배열 선언하기)
        int[] arr =new int[n];
        int start = 0;
        int end = 0;
        for(int i =0; i<n; i++){
            //for(N의 개수만큼 반복){
            //    A배열 저장하기
            arr[i] = sc.nextInt();
            //    시작 인덱스 저장(A 배열 중 최댓값)
            //    종료 인덱스 저장(A 배열의 총합)
            if(start < arr[i]){
                start = arr[i];
                end = end + arr[i];
            }
            //}
        }
        //start(시작 인덱스), end(종료인덱스)
        //while(시작 인덱스 <= 종료 인덱스) {
        while (start <= end) {
            //    middle(중간 인덱스)
            int middle = (start + end) / 2;
            //    sum(레슨 합)
            int sum = 0;
            //    count(현재 사용한 블루레이 개수)
            int count = 0;
            //    for(N의 개수만큼 반복하기){
            for(int i=0; i<n; i++) {
                //        만약 sum + 현재 레슨 시간 > 중간 인덱스이면
                if(sum + arr[i] > middle) {
                    //        count값을 올리고 sum을 0으로 리셋하기
                    //        // 현재 블루레이에 저장할 수 없어 새로운 블루레이도 교체한다는 의미
                    count++;
                    //        sum에 현재 레슨 시간값 더하기
                    sum = 0;
                    //    }
                }
                sum = sum + arr[i];
            }
            if(sum != 0){
                //    sum이 0이 아니면 마지막 블루레이가 필요하므로 count값 올리기
                count++;
            }
            if(count > m){
                //    if(count > M: 중간 인덱스값으로 모든 레슨 저장 불가능) 시작인덱스 = 중앙 인덱스 + 1
                start =middle +1;
            }else {
                //    else(중간 인덱스값으로 모든 레슨 저장 가능) 종료 인덱스 = 중앙 인덱스 -1
                end = middle -1;
            }
            // System.out.println(count + "aa");
        }
        System.out.println(start);
        //}
        //시작 인덱스 출력하기
    }
}
