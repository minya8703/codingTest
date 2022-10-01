package programmers.stackAndqueue;


import java.util.*;

public class 기능개발 {
    public static void main(String[] args){
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        System.out.println(Arrays.toString(solution(progresses, speeds)));
        System.out.println(" 멘토결과 ");
        System.out.println(Arrays.toString(solution1(progresses, speeds)));

    }
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
    public static int[] solution1(int[] progresses, int[] speeds) {
        Queue<Integer> jobQueue = new LinkedList<>();
        for(int i=0; i<progresses.length; i++){
            float p= progresses[i];
            float s = speeds[i];
            int days = (int)Math.ceil((100-p)/s);
            jobQueue.offer(days);
        }
        // [7, 3, 9]
        Queue<Integer> answer = new LinkedList<>();
        int d = jobQueue.poll();
        int count = 1;
        while (!jobQueue.isEmpty()){
            int n = jobQueue.poll();
            if(d >= n){
                count++;
                continue;
            }
            answer.offer(count);
            count = 1;
            d = n;

        }
        answer.offer(count);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
