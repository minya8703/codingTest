package doitAlgorithm.dataStructure;

import java.util.Scanner;
/*
 * 백준 1546
 * 시간 제한 2초
 * */
public class 배열리스트_평균구하기002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 변수 n에 과목의 수 입력 받기
        int n = sc.nextInt();
        // 길이가 n인 1차 배열 arr[] 선언하기
        int[] arr = new int[n];
        // for(arr[] 길이 만큼 반복하기){
        //    arr[i]에 점수 저장하기
        // }
        for(int i=0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        // int형 max 변수 선언
        long max = 0;
        // int형 sum 변수 선언
        long sum = 0;
        // for(arr[] 길이 만큼 반복하기){
        //    최고점은 변수 max에, 총점은 변수 sum에 저장하기
        // }
        for(int i = 0; i<n ;i++){
            if(arr[i] > max) {
                max = arr[i];
            }
            sum = sum + arr[i];
        }
        // sum * 100 / max / n 출력하기
        System.out.println(sum * 100.0 / max / n);
    }
}
