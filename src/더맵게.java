import java.util.*;
/*
- 자료구조/알고리즘: 우선순위 큐
- 시간 복잡도 : O(n)
- 공간 복잡도 : O(n)
- 소요 시간: 20분
*/
public class 더맵게 {
    public static int solution(int[] scoville, int K) {
        int answer = 0;
        // 우선순위 큐
        PriorityQueue<Integer> pQueue = new PriorityQueue();
          for(int s : scoville){
              pQueue.offer(s);
        }
        while(pQueue.peek() < K){
            if(pQueue.size() <= 1) return -1;

            int first = pQueue.poll();
            int second = pQueue.poll();

            int mix = first + second * 2;
            pQueue.offer(mix);
            answer++;
        }
        return answer;
    }
    public static void main(String[] args){
        int[] scovillle = {1, 2, 3, 9, 10, 12};
        int k = 7;
        System.out.println(solution(scovillle, k));
    }
}
