package doitAlgorithm.dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 투포인터_좋은수구하기008 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // N(배열의 데이터 개수)
        int n = Integer.parseInt(bf.readLine());
        int result = 0;
        // A[N] 배열 선언
        long a[] = new long[n];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        // for(N만큼 반복하기){
        //     A 배열에 데이터 저장
        // }
        for(int i = 0; i<n; i++){
            a[i] = Long.parseLong(st.nextToken());
        }
        // A배열 정렬하기
        Arrays.sort(a);
        // for(N만큼 반복하기){
        for (int k = 0; k<n; k++){
        //     변수 초기화 하기(찾고자 하는 값 k, 포인터 i, 포인터 j)
            long find = a[k];
            int i = 0;
            int j = n-1;
            // 투 포인터 알고리즘
            //     while(i<j){
            while(i<j) {
                //         if(A[i] + A[j] ==  찾고자 하는 값)
                if (a[i] + a[j] ==find) {
                    // find는 서로 다른 두수의 합이어야 함을 체크
                    //             두 포인터 i, j가 k가 아닐 때 결괏값에 반영 및 while 문 종료하기
                    if(i != k && j !=k){
                        //             두 포인터 i, j가 k가 맞을 때 포인터 변경 및 계속 수행
                        result++;
                        break;
                    } else if(i == k){
                        i++;
                    } else if(j == k) {
                        j--;
                    }
                } else if(a[i] + a[j] <find){
                    //         else if(k> M)포인터 i 증가
                    i++;
                } else {
                    //         else 포인터 j증가
                    j--;
                }
            }
            //     }
        }
        // }
        // 좋은 수의 개수 출력
        System.out.println(result);
        bf.close();
    }
}
