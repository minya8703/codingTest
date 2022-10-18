package doitAlgorithm.sort;

import java.util.Scanner;

public class 버블정렬_수정렬하기015 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // N(정렬할 수 개수)
        int n = sc.nextInt();
        // A(정렬할 배열 선언)
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        // for(i정렬할 수의 갯수-1 만큼){
        //     for(j정렬할 수 개수 -1 -i){
        //         현재 A의 배열의 값보다 1칸 오른 쪽 배열의 값이 더 작으면 두수 바꾸기
        //     }
        // }
        for(int i = 0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int i = 0;i<n;i++){
            System.out.println(arr[i]);
        }
        // A배열 출력

    }
}
