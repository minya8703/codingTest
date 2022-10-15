package doitAlgorithm.dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

public class 스택과큐_절댓값힙구현하기014 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // N(질의 요청 개수)
        int n = Integer.parseInt(br.readLine());
        // 우선순위 큐 선언
        PriorityQueue<Integer> queue = new PriorityQueue<>(((o1, o2) -> {
            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);
            if (first_abs == second_abs) {
                return o1 > o2 ? 1:-1;
                // - 절대값 기준으로 정렬되도록 설정하기
            } else {
                // - 단, 절댓값이 같ㅇ면 음수 우선 정렬하기
                return first_abs - second_abs;
            }
        }));
        System.out.println(queue);
        // for(N만큼 반복){
        //     요청이 0일 때: 큐가 비어 있으면 0, 비어 있지 않으면 큐의 front값 출력하기(poll())
        //     요청이 1일 때: 새로운 데이터를 우선순위 큐에 더하기(add())
        // }
        for(int i=0;i<n;i++){
            int request = Integer.parseInt(br.readLine());
            if(request == 0) {
                if(queue.isEmpty()){
                    System.out.println("0");
                } else {
                    System.out.println(queue.poll());
                }
            } else {
                queue.add(request);
            }
        }
    }
}
