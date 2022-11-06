package doitAlgorithm.search;

import java.util.*;

public class 너비우선탐색_트리의지름구하기028 {
    // N(노드 개수) A(그래프 데이터 저장 인접 리스트) // ArrayList<Edge>[] 형태로 선언하기
    static boolean visited[];
    static int[] distance;
    static ArrayList< Edge>[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // visited(방문 기록 저장 배열) distance(거리 저장 배열)
        arr = new ArrayList[n+1];
        // for(N의 개수만큼 반복하기) {
        //     A 인접 리스트의 각 ArrayList 초기화하기
        // }
        for(int i=0; i<=n; i++){
            arr[i] = new ArrayList< Edge>();
        }
        // for(M의 개수만큼 반복하기){
        //     A 인접 리스트에 그래프 데이터 저장하기
        // }
        for(int i=0; i<n; i++){
            int s = sc.nextInt();
            while(true){
                int e = sc.nextInt();
                if(e == -1){
                    break;
                }
                int v = sc.nextInt();
                arr[s].add(new Edge(e, v));
            }
        }
        // distance 배열 초기화 하기
        distance = new int[n+1];
        // visited 배열 초기화 하기
        visited = new boolean[n+1];
        // BFS(임의의 점을 시작점으로) 실행하기
        BFS(1);
        int max=1;
        // distance 배열에서 가장 큰 수를 정답으로 출력하기
        for(int i=2; i<=n; i++){
            if(distance[max] < distance[i]){
                max = i;
            }
        }
        distance = new int[n+1];
        visited = new boolean[n+1];
        BFS(max);
        Arrays.sort(distance);
        System.out.println(distance[n]);

    }
    private static void BFS(int index){
        // BFS {
         Queue<Integer> queue = new LinkedList<>();
        //     큐 자료구조에 시작 노드 삽입하기(add 연산)
        queue.add(index);
        //     visited 배열에 현재 노드 방문 기록하기
        visited[index] = true;
        //     while(큐가 비어 있을 때까지){
        while(!queue.isEmpty()) {
            //         큐에서 노드 데이터를 가져오기(poll 연산)
            int now_node = queue.poll();
            for(Edge i : arr[now_node]) {
                //         가져온 노드 출력하기
                int e = i.e;
                int v = i.value;
                if(!visited[e]) {
                    //         현재 노드의 연결 노드 중 방문하지 않으 노드로
                    //         큐에 데이터 삽입(add 연산)하고 visited 배열에 방문 기록하기
                    visited[e] = true;
                    queue.add(e);
                    //         그리고 현재 노드의 거리 + 에지의 가중치로 방문하지 않은 노드 거리 배열 업데이트하기
                    distance[e] = distance[now_node] + v;
                    //     }
                    // }
                }
            }
        }
    }
}
class Edge {
    // Edge {// 에지 클래스 별도 구현하기
    //     e(목적지 노드), value(에지의 가중치)
    // }
    int e;
    int value;

    public Edge(int e, int value) {
        this.e = e;
        this.value = value;
    }
}
