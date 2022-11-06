package doitAlgorithm.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 너비우선탐색_미로탐색하기027 {
    // dx, dy(상하좌우를 탐색하기 위한 define값 정의 변수)
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static boolean[][] visited;
    static int[][] arr;
    static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // A(데이터 저장 2차원 행렬)
        // N(row), M(column)
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        // A 배열 초기화 하기
        arr = new int[n][m];
        // visited 배열 초기화하기
        visited = new boolean[n][m];
        // visited(방문 기록 저장 배열)
        // for(N의 개수만큼 반복){
        //     for(M의 개수만큼 반복){
        //         A배열에 데이터 저장하기
        //     }
        // }
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(line.substring(j, j + 1));
            }
        }
        // BFS(0, 0) 실행하기
        BFS(0, 0);
        System.out.println(arr[n - 1][m - 1]);
    }
    private static void BFS(int i, int j){
        // BFS{
        Queue<int[]> queue = new LinkedList<>();
        //    큐 자료구조에 시작 노드 삽입하기(add연산)
        queue.offer(new int[] {i, j});
        //    while(큐가 비어 있을 때까지){
        while(!queue.isEmpty()) {
            //        큐에서 노드 데이터를 가져오기(poll 연산)
            int now[] = queue.poll();
            //    visited 배열에 현재 노드 방문 기록하기
            visited[i][j] = true;
            //        for(상하좌우 탐색) {
            for(int k = 0; k<4; k++) {
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];
                //            if(유효한 좌표){
                if(x >= 0 && y>= 0 && x < n && y<m) {
                    // if(이동할 수 있는 칸이면서 방문하지 않은 노드) {
                    if(arr[x][y] != 0 && !visited[x][y]) {
                        // visited 배열에 방문 기록하기
                        visited[x][y] = true;
                        // A 배열에 depth를 현재 노드의 depth + 1로 업데이트하기
                        arr[x][y] = arr[now[0]][now[1]]+1;
                        // 큐에 데이터 삽입하기(add 연산)
                        queue.add(new int[] {x, y});
                        //                }
                        //            }
                        //        }
                        //    }
                        // }
                    }
                }
            }
        }
    }
}

