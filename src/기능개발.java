import java.util.*;
/*
- 자료구조/알고리즘: Queue
- 시간 복잡도 : O(mn)
- 공간 복잡도 : O(n)
- 소요 시간: 30분
*/
public class 기능개발 {
    public static int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> jobQueue = new LinkedList<>();
        int day = 0;
        for(int i=0; i<speeds.length;i++){
            day = (100- progresses[i])/speeds[i];
            if((100- progresses[i]) % speeds[i] != 0){
                day++;
            }
            jobQueue.add(day);
        }
        List<Integer> answer = new LinkedList<>();
        while (!jobQueue.isEmpty()){
            int cut = 1;
            int nowJob = jobQueue.poll();
            while (!jobQueue.isEmpty() && nowJob >= jobQueue.peek()){
                cut++;
                jobQueue.poll();
            }
            answer.add(cut);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        System.out.println(solution(progresses, speeds));

        int[] progresses1 = {95, 90, 99, 99, 80, 99};
        int[] speeds1 = {1, 1, 1, 1, 1, 1};
        System.out.println(solution(progresses1, speeds1));

    }
}
