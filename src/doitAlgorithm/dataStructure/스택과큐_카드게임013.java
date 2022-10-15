package doitAlgorithm.dataStructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 스택과큐_카드게임013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // N (카드의 개수) myQueue(카드 저장 자료구조)
        Queue<Integer> queue = new LinkedList<>();
        int n = sc.nextInt();
        // for(카드의 개수 만큼 반복){
        //     큐에 카드 저장하기
        // }
        for(int i = 1; i<=n; i++){
            queue.add(i);
        }
        // while(카드가 1장 남을 때까지){
        // }
        while(queue.size()>1){
            //     맨위의 카드를 버림 : poll()
            queue.poll();
            //     맨위의 카드를 가장 아래의 카드 밑으로 이동 : poll() → add()
            queue.add(queue.poll());
        }
        System.out.println(queue.peek());
        // 마지막으로 남은 카드 출력
    }
}
