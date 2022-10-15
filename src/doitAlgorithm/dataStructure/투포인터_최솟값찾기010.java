package doitAlgorithm.dataStructure;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class 투포인터_최솟값찾기010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 출력을 버퍼에 넣고 한 번에 출력 하기 위해 BurreredWriter 사용
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // N(데이터의 개수), L(최솟값을 구하는 범위)
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        // Deque<Node> deque(데이터를 담을 덱 자료구조)
        Deque<Node> deque = new LinkedList<>();
        // 배열 선언하기
        //
        // for(N만큼 반복){
        for(int i=0; i<n; i++){
            int now = Integer.parseInt(st.nextToken());
            // 새로운 값이 들어올 때마다 정렬대신 현재 수보다 큰 값을 덱에서 제거해 시간 복잡도를 줄임
            //     now(현재 데이터 값)
            while (!deque.isEmpty() && deque.getLast().value > now){
                //         덱의 마지막 위치에서부터 now보다 큰 값은 덱에서 제거(나보다 값이 큰 데이터 제거(최소값))
                deque.removeLast();
            }
            deque.addLast(new Node(now, i));
            // 범위에서 벗어난 값은 덱에서 제거
            if(deque.getFirst().index <= i-l){
                deque.removeFirst();
            }
            bw.write(deque.getFirst().value + " ");
        }
        bw.flush();
        bw.close();
        //         덱의 마지막 위치에 now값 저장하기
        //         덱의 1번째 위치에서부터 L의 범위를 벗어난 값(now index-L <= index)을 덱에서 제거하기
        //         덱의 1번째 데이터 출력
        // }
        //
        // 덱에 저장할 노드 클래스 별도 생성히기
        // 노드 클래스에는 index(자신의 위치), value(자신의 값)담기
    }
    static class Node {
        public int value;
        public int index;

        Node(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
}
