package doitAlgorithm.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 깊이우선탐색_연결요소의개수023 {
    private static ArrayList<Integer>[] arr;
    private static boolean visited[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // n(노드 개수) m(에지 개수)
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        // arr(그래프 데이터 저장 인접 리스트)
        arr = new ArrayList[n +1];
        // visited(방문 기록 저장 배열)
        visited = new boolean[n +1];
        // for(n의 개수만큼 반복하기){
        //     arr 인접 리스트이 각 ArrayList 초기화하기
        // }
        for(int i=1; i<n+1; i++){
            arr[i] = new ArrayList<Integer>();
        }
        // for(m의 개수만큼 반복하기){
        //     arr 인접 리스트에 그래프 데이터 저장하기
        // }
        for(int i=0; i< m; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            arr[s].add(e);
            arr[e].add(s);
        }
        int count = 0;
        // for(n의 개수만큼 반복하기){
        //     if(방분하지 않은 노드가 있으면){
        //         연결 요소 개수++
        //         DFS 실행하기
        //     }
        // }
        for(int i=1; i<n+1; i++){
            if(!visited[i]) {
                count++;
                DFS(i);
            }
        }
        System.out.println(count);
        // // DFS 구현하기
    }
    static void DFS(int v){
        // DFS {
        //     if(현재 노드 == 방문 노드) return;
        if(visited[v]){
            return;
        }
        //     visited 배열에 현재 노드 방문 기록하기
        visited[v] = true;
        //     현재 노드의 연결 노드 중 방문하지 않은 노드로 DFS 실행하기(재귀 함수 상태)
        for(int i : arr[v]){
            if(visited[i] == false) {// 연결 노드 중 방문하지 않았던 노드만 탐색하기
                DFS(i);
            }
        }
        // }
    }
}
