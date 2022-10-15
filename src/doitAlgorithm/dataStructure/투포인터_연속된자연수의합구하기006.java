package doitAlgorithm.dataStructure;

import java.util.Scanner;

public class 투포인터_연속된자연수의합구하기006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // N 변수 저장
        int n = sc.nextInt();
        // 사용 변수 초기화(count = 1, start_index = 1, end_index = 1, sum = 1)
        int count = 1;
        int start_index = 1;
        int end_index = 1;
        int sum = 1;
        // while(end_index != N) {
        //     if(sum == N) count 증가, end_index 증가, sum 값 변경
        //     else if(sum > N) sum값 변경, start_index 증가
        //     else if(sum < N) end_index 증가, sum 값 변경
        // }
        while(end_index !=n){
            if(sum == n){
                count++;
                end_index++;
                sum = sum +end_index;
            } else if(sum > n){
                sum = sum - start_index;
                start_index++;
            } else {
                end_index++;
                sum = sum + end_index;
            }
        }
        System.out.println(count);
        // count 출력
    }
}
