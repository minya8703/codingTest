package doitAlgorithm.dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 백준 11660
 * 시간 제한 1초
 * */
public class 구간합_구간합구하기2차원004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // N(배열 크기) M(질의 수) 저장하기
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int a[][] = new int[n + 1][n + 1];
        // for(N만큼 반복) {
        //    for(N만큼 반복) {
        //        원본 배열 저장
        //    }
        // }
        for(int i=1; i<=n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=n; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int d[][] = new int[n+1][n+1];
        // for(N만큼 반복) {
        //    for(N만큼 반복) {
        //        합 배열 저장하기
        //        D[i][j] = D[i][j-1] + D[i-1][j] - D[i-1][j-1] + A[i][j]
        //    }
        // }
        for (int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                // 구간 합 구하기
                d[i][j] = d[i][j-1] + d[i-1][j] - d[i-1][j-1] + a[i][j];
            }
        }
        // for(M만큼 반복) {
        //    질의 계산 및 출력
        //    결과 = D[x2][y2] = D[x1-1][y2] - D[x2][y1-1] + D[x1-1][y1-1]
        // }
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            // 구간 합 배열로 질의의 답변하기
            int result = d[x2][y2] - d[x1-1][y2] - d[x2][y1 - 1] + d[x1 - 1][y1 - 1];
            System.out.println(result);
        }
    }
}
