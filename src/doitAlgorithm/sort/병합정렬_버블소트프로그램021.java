package doitAlgorithm.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 병합정렬_버블소트프로그램021 {
    static int[] arr, tmp;
    static long result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // N(정렬할 수 개수)
        int n = Integer.parseInt(br.readLine());
        // A(정렬할 배열 선언하기)
        arr = new int[n + 1];
        // tmp(정렬할 때 잠시 사용할 임시 배열 선언하기)
        tmp = new int[n + 1];
        // for(N의 개수만큼){
        //     A배열 선언하기
        // }
        for(int i=1; i<=n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        result = 0;
        // 병합 정렬 함수 수행하기
        merget_sort(1, n);
        // 결괏값 출력하기
        System.out.println(result);

    }
    private static void merget_sort(int s, int e){
        // 병합 정렬 수행하기
        // 병합정렬(s, e) {
        if(e - s < 1){
            return;
        }
        //     s(시작점), e(종료점),m(중간점)
        int m = s + (e -s)/2;
        //     // 재귀 형태로 구현하기
        //     병합 정렬(s, m)
        merget_sort(s, m);
        //     병합 정렬(m + 1, e)
        merget_sort(m + 1, e);
        //     for(s ~ e){
        //         tmp 배열 저장하기
        //     }
        for(int i=s; i<=e; i++){
            tmp[i] = arr[i];
        }
        int k = s;
        //     index1  → 앞쪽 그룹 시작점
        int index1 = s;
        //     index2  → 뒷쪽 그룹 시작점
        int index2 = m+1;
        while (index1 <= m && index2 <= e) {
            //     // 두 그룹을 병합하는 로직
            //     while(index1 <= 중간점 && index2 <= 종료점) {
            //         뒤쪽 데이터 값이 더 작아 선택될 때
            if(tmp[index1]>tmp[index2]){
                arr[k] = tmp[index2];
                result = result + index2 -k;
                k++;
                index2++;
            } else {
                arr[k] = tmp[index1];
                k++;
                index1++;
            }
            //         swap이 일어났다고 가정하고, 현재 남아 있는 데이터 개수만큼 결괏값을 더함
            //     }
        }
        while (index1 <= m){
            arr[k] = tmp[index1];
            k++;
            index1++;
        }
        while (index2 <= m){
            arr[k] = tmp[index2];
            k++;
            index2++;
        }
        //     반복문의 끝난 후 남아 있는 데이터 정리하기
        // }
    }
}
