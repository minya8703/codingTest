package doitAlgorithm.search;

import java.util.*;

public class 너비우선탐색_DFS와BFS프로그램026 {
    static boolean visited[];
    static ArrayList<Integer>[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // N(노드 개수) M(에지 개수) Start(시작점)
        int n = sc.nextInt();
        int m = sc.nextInt();
        int start = sc.nextInt();
        // A(그래프 데이터 저장 인접 리스트) visited(방문 기록 저장 배열)
        arr = new ArrayList[n + 1];

        // for(N의 개수만큼 반복하기){
        //     A 인접 리스트의 각 ArrayList 초기화 하기
        // }
        for(int i=0; i<=n; i++){
            arr[i] = new ArrayList<Integer>();
        }
        // for(M의 개수만큼 반복하기) {
        //     A 인접 리스트에 그래프 데이터 정렬하기
        // }
        for(int i=0; i<m; i++){
            int s = sc.nextInt();
            int e = sc.nextInt();
            arr[s].add(e);
            arr[e].add(s);
        }
        // // 방문할 수 있는 노드가 여러 개일 경우에는 번호가 작은 것을 먼저 방문하기 위해 정렬하기
        // for(N의 개수만큼 반복하기){
        //     각 노드와 관련된 에지를 정렬하기
        // }
        for(int i=1; i<=n; i++){
            Collections.sort(arr[i]);
        }
        // visited 배열 초기화 하기
        visited = new boolean[n +1];
        // DFS(Start) 실행하기
        DFS(start);
        System.out.println();
        // visited 배열 초기화하기
        visited = new boolean[n + 1];
        // BFS(Start) 실행하기
        BFS(start);
        System.out.println();
    }

    private static void DFS(int node) {
        // DFS{
        //     현재 노드 출력하기
        System.out.print(node + " ");
        //     visited 배열에 현재 노드 방문 기록하기
        visited[node] = true;
        //     현재 노드의 연결 노드 중 방문하지 않은 노드로 DFS실행하기(재귀 함수 형태)
        for(int i : arr[node]){
            if(!visited[i]){
                DFS(i);
            }
        }
        // }
    }
    private static void BFS(int node) {
        // BFS{
        Queue<Integer> queue = new LinkedList<Integer>();
        //     큐 자료구조에 시작 노드 삽입하기(add연산)
        queue.add(node);
        //     visited 배열에 현재 노드 방문 기록하기
        visited[node] = true;
        //     while(큐가 비어 있을 때까지){
        while (!queue.isEmpty()) {
            //         큐에서 노드 데이터를 가져오기(poll 연산)
            int newNode = queue.poll();
            //         가져온 노드 출력하기
            System.out.print(newNode + " ");
            for(int i: arr[newNode]){
                // 현재 노드의 연결 노드 중 미방문 노드를 큐에 삽입(add 연산)하고 방문 배열에 기록하기
                if(!visited[i]){
                    visited[i] = true;
                    queue.add(i);
                }
            }
            //     }
            // }
        }
    }
}
