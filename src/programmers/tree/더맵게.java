package programmers.tree;

import java.util.*;
public class 더맵게 {
    public static void main(String[] args){
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int k = 7;
        System.out.println(solution(scoville, k));
        System.out.println("멘토 결과");
        System.out.println(solution1(scoville, k));
    }
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
    public static int solution1(int[] scoville, int K) {
        PriorityQueue<Long> minScoville = new PriorityQueue<>();
        for (int score : scoville) {
            minScoville.offer((long)score);
        }

        int mixCount = 0;
        while (minScoville.peek() < K) {
            if (minScoville.size() < 2) {
                return -1;
            }
            long newScore = minScoville.poll() + 2 * minScoville.poll();
            minScoville.offer(newScore);
            mixCount++;
        }

        return mixCount;
    }
}
