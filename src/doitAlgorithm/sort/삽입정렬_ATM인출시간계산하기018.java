package doitAlgorithm.sort;

import java.util.Scanner;

public class 삽입정렬_ATM인출시간계산하기018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // N(사람 수)
        int n = sc.nextInt();
        // A(자릿수별로 구분해 저장한 배열)
        int[] arr = new int[n];
        // S(A 합 배열 : 각 사람이 인출을 완료하는 데 필요한 시간을 저장하기)
        int[] arrSum = new int[n];
        // for(N만큼 반복하기){
        //     A 배열 저장하기
        // }
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // for(i:N만큼 반복하기) {
        for (int i=1; i<n; i++){// 삽입정렬
            int insert_point = i;
            int insert_value = arr[i];
        //     for(j: i -1 ~ 0 까지 뒤에서부터 반복하기) {
            for(int j=i-1; j>=0; j--) {
                //         현재 범위에서 삽입 위치 찾기
                if(arr[j] < arr[i]){
                    insert_point = j + 1;
                    break;
                }
                if(j ==0) {
                    insert_point = 0;
                }
                //     }
            }
        //     for(j: i~insert_point + 1까지 뒤에서부터 반복하기) {
        //         삽입을 위해 삽입 위치에서 i까지 데이터 한 칸씩 뒤로 밀기
        //     }
            for(int j= i; j >insert_point; j--) {
                //     삽입 위치에 현재 데이터 삽입하기
                arr[j] = arr[j-1];
                // }
            }
            arr[insert_point] = insert_value;
        }
        arrSum[0] = arr[0]; // 합배열 만들기
        // for(i: N만큼 반복하기) {
        for(int i = 1; i<n; i++) {
            //     A 배열을 통한 합 배열 S만들기
            arrSum[i] = arrSum[i-1] + arr[i];
            // }
        }
        int sum = 0; // 합배열 총합
        // S 배열의 각 데이터 값을 모두 합해 결과 출력하기
        for(int i = 0; i<n; i++){
            sum = sum + arrSum[i];
        }
        System.out.println(sum);
    }
}
