package doitAlgorithm.sort;

import java.util.Scanner;

public class 선택정렬_내림차순으로자릿수정렬017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // str(정렬할 수)
        String str = sc.next();
        // arr[자릿수별로 구분해 저장한 배열]
        int [] arr = new int[str.length()];
        // for(str의 길이만큼 반복){
        //     arr 배열 저장 → str.substrihng 사용하기
        // }
        for(int i=0; i<str.length(); i++){
            arr[i] = Integer.parseInt(str.substring(i, i+1));
        }
        // for(i: 0~str의 길이 만큼 반복){
        for(int i=0; i<str.length(); i++) {
            int max= i;
            for(int j= i+1; j<str.length(); j++) {
                //     for(j: i+1 ~ str의 길이만큼 반복) {
                if(arr[j] > arr[max]) {// 내림차순이므로 최댓값을 찾음
                    //         현재 범위에서 Max값 찾기
                    //     }
                    //     현재 i의 값과 Max값 중 Max값이 더 크면 swap 수행하기
                    max = j;
                    // }
                }
                if(arr[i] < arr[max]){
                    int temp = arr[i];
                    arr[i] = arr[max];
                    arr[max] = temp;
                }
            }
        }
        // arr배열 출력
        for(int i=0; i<str.length(); i++){
            System.out.print(arr[i]);
        }
    }
}
