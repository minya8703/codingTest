package doitAlgorithm.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 퀵정렬_K번째수구하기019 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        // N(숫자의 개수) K(K번째 수)
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        // A(숫자 데이터 저장 배열)
        int[] arr = new int[n];
        // for(N만큼 반복하기) {
        //     A배열 저장하기
        // }
        for(int i = 0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        // 퀵 소스 실행하기
        quickSort(arr, 0, n-1, k-1);
        // K번째 데이터 출력하기
        System.out.println(arr[k-1]);
        //

        //     피벗 데이터를 나눠진 두 그룹의 경계 index에 저장하기
        // }

    }
    public static void quickSort(int[] arr, int s, int e, int k){
        // [별도의 함수 구현 부분]
        // 퀵 소트 함수(시작, 종료, K){
        // }
        if(s < e) {
            //     피벗 구하기 함수(시작, 종료)
            int pivot = partition(arr, s, e);
            if(pivot == k){ // K번째 수가 pivot이면 더이상 구할 필요 없음
                //     if(피벗 == K) 종료
                return;
            } else if(k<pivot){ // K가 pivot보다 작으면 왼쪽 그룸만 정렬 수행하기
                //     else if(K < 피벗) 퀵 소트 수행하기 (시작, 피벗 -1, K)
                quickSort(arr, s, pivot - 1, k);
            } else {// K가 pivot보다 크면 오른쪽 그룹만 수행하기
                //     else 퀵 소트 수행하기(피벗 + 1, 종료, K)
                quickSort(arr, pivot + 1, e, k);
            }
        }
    }
    public static int partition(int[] arr, int s, int e){
        // 피벗 구하기 함수(시작, 종료){
        int mid = (s + e) /2;
        //     중앙값을 피벗으로 설정하기
        swap(arr, s, mid);
        int pivot = arr[s];
        //     i(시작점), j(종료점)
        int i = s, j=e;
        //     while(i < j){
        while (i < j) {
            //         피벗보다 큰 수가 나올 때까지 i++
            while (pivot< arr[j]) {
                //         피벗보다 작은 수가 나올 때까지 j--
                j--;
            }
            while (i < j && pivot >=arr[i]){
                i++;
            }
            //         찾은 i와 j 데이터를 swap
            swap(arr, i, j);
            }
        // i==j 피벗의 값을 양쪽으로 분리한 가운데에 오도록 설정하기
        arr[s] = arr[i];
        arr[i] = pivot;
        return i;
        //     }
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}
