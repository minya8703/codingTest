package doitAlgorithm.sort;

import java.io.*;

public class 병합정렬_수정렬하기020 {
    static int[] arr, tmp;
    static long result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // N(정렬할 수 개수)
        int n = Integer.parseInt(br.readLine());
        // A(정렬할 배열 선언하기)
        arr = new int[n +1];
        // tmp(정렬할 때 잠시 사용할 임시 배열 선언하기)
        tmp = new int[n +1];
        // for(N의 개수만큼){
        //     A배열 선언하기
        // }
        for(int i = 1; i<=n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        // 병합 정렬 함수 수행하기
        merget_sort(1, n);
        // 결괏값 출력하기
        for(int i=1; i<=n; i++){
            bw.write(arr[i] + "\n");
        }
        bw.flush();
        bw.close();

    }
    private static void merget_sort(int str, int end){
        // // 병합 정렬 수행하기
        // 병합정렬(s, e) {
        if(end - str < 1){
            return;
        }
        //     s(시작점), e(종료점), m(중간점)
        int mid = str + (end - str) / 2;
        //     // 재귀 함수 형태로 구현하기
        //     병합 정렬(s, m)
        merget_sort(str, mid);
        //     병합 정렬(m + 1, e)
        merget_sort(mid+1, end);
        //     for(s ~ e){
        //         tmp 배열 저장하기
        //     }
        for(int i=str; i<=end; i++){
            tmp[i] = arr[i];
        }
        int k = str;
        //     index1 → 앞쪽 그룹 시작점
        int index1 = str;
        //     index2 → 뒤쪽 그룹 시작점
        int index2 = mid + 1;
        while(index1<=mid && index2 <= end){
            //     while(index1 <= 중간점 && index <= 종료점){
            //     // 두 그룹을 병합하는 로직
            //         양쪽 그룹의 index가 가리키는 값을 비교한 후 더 작은 수를 선택해 배열에 저장하고,
            //         선택된 데이터의 index 값을 오른쪽을 한 칸 이동하기
            if(tmp[index1] > tmp[index2]) {
                arr[k] = tmp [index2];
                k++;
                index2++;
            } else {
                arr[k] = tmp[index1];
                k++;
                index1++;
            }
        }
        //         반복문의 끈난 후 남아 있는 데이터 정리하기
        while (index1 <= mid) {
            arr[k] = tmp[index1];
            k++;
            index1++;
        }
        while(index2 <= end) {
            arr[k] = tmp[index2];
            k++;
            index2++;
        }
        //     }
        // }
    }
}
