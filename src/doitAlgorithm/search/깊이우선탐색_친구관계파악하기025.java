package doitAlgorithm.search;

import java.util.ArrayList;
import java.util.Scanner;

public class 깊이우선탐색_친구관계파악하기025 {
    static boolean[] visited;
    static ArrayList<Integer>[] arr;
    static boolean arrive;
    public static void main(String[] args) {
        // N(노드 개수) M(에지 개수)
        int n;
        int m;
        // A(그래프 데이터 저장 인접 리스트)
        // visited(방문 기족 저장 배열)
        // arribe(도착 확인 변수)
        arrive = false;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new ArrayList[n];
        visited = new boolean[n];
        // for(N의 개수만큼 반복){
        //     A 인접 리스트의 각 ArrayList 초기화 하기
        // }
        for(int i = 0; i<n; i++){
            arr[i] = new ArrayList<Integer>();
        }
        // for(M의 개수만큼 반복하기){
        //     A 인접 리스트에 그래프 데이터 저장하기
        // }
        for(int i=0; i<m; i++){
            int s = sc.nextInt();
            int e = sc.nextInt();
            arr[s].add(e);
            arr[e].add(s);
        }
        // for(N의 개수만큼 반복하기){
        //    각 노드마다 DFS 실행하기
        //    if(arrive) 반복문 종료 //depth가 5에 도달한 적이 있다면
        // }
        for(int i=0; i<n; i++){
            DFS(i, 1);
            if(arrive){
                break;
            }
        }
        if(arrive){
            // if(arrive) 1출력
            System.out.println("1");
        }else{
            // else 0 출력
            System.out.println("0");
        }
    }
    // // DFS 구현하기
    private static void DFS(int now, int depth) {
        // DFS {
        //     if(깊이가 5 || arrive){
        if(depth == 5 || arrive) {
            //     방문 배열에 현재 노드 방문 기록하기
            arrive = true;
            //         arrive = true;
            //         함수 종료
            return;
            //     }
        }
        visited[now] = true;
        for(int i : arr[now]) {
            //     현재 노드의 연결 노드중 방문하지 않은 노드로 DFS실행하기(호출마다 depth는 1씩 증가)
            if(!visited[i]){
                DFS(i, depth +1);
            }
        }
        visited[now] = false;
        // }
    }
}
