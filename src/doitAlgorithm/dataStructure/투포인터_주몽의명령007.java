package doitAlgorithm.dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 투포인터_주몽의명령007 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // N(재료의 개수), M(갑옷이 되는 번호) 저장하기
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        // for(N만큼 반복){
        //     재료 배열 저장하기
        // }
        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(Arrays.toString(a));
        // 재료 배열 정렬하기
        Arrays.sort(a);
        int count = 0;
        int i = 0;
        int j = n-1;
        // while(i < j){
        //     if(재료 합 < M) 작은 번호 재료를 한 칸 위로 변경하기
        //     else if(재료 합 > M) 큰 번호 재료를 한 칸 아래로 변경하기
        //     else 경우의 수 증가, 양쪽 index 각각 변경하기
        // }
        while(i < j){
            if(a[i] + a[j] < m){
                i++;
            } else if(a[i] + a[j] > m){
                j--;
            } else {
                count++;
                i++;
                j--;
            }
        }
        System.out.println(count);
        // count 출력하기
    }
}
