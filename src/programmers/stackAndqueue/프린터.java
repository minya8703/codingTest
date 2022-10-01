package programmers.stackAndqueue;

import java.util.*;

public class 프린터 {
    public static void main(String[] args) {
        int[] priorities = {2, 1, 3, 2};
        int location = 2;
        int[] priorities1 = {1, 1, 9, 1, 1, 1};
        int location1 = 0;
        System.out.println(solution(priorities, location));
        System.out.println(solution(priorities1, location1));
        System.out.println("결과 2");
        System.out.println(solution1(priorities, location));
        System.out.println(solution1(priorities1, location1));
    }

    public static int solution(int[] priorities, int location) {
        Queue<PrintItem> waitList = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            waitList.offer(new PrintItem(i, priorities[i]));
        }
        Arrays.sort(priorities);

        int currentIndex = 0;
        int priorityIndex = priorities.length - 1;
        while (!waitList.isEmpty()) {
            PrintItem currentItem = waitList.poll();
            if (currentItem.priority == priorities[priorityIndex]) {
                currentIndex++;
                priorityIndex--;
                if (currentItem.location == location) {
                    break;
                }
            } else {
                waitList.offer(currentItem);
            }
        }
        return currentIndex;
    }

    static class PrintItem {
        int location;
        int priority;

        public PrintItem(int location, int priority) {
            this.location = location;
            this.priority = priority;
        }
    }

    public static int solution1(int[] priorities, int location) {

        List<Paper> queue = new LinkedList<>();
        for(int i=0; i<priorities.length; i++){
            queue.add(new Paper(i == location, priorities[i]));
        }
        int answer = 0;
        while (!queue.isEmpty()) {
            Paper now = queue.remove(0);
            boolean printable = true;
            for (Paper p : queue) {
                if (now.priority < p.priority) {
                    printable = false;
                    break;
                }
            }
            if (!printable) {
                queue.add(now);
                continue;
            }
            answer++;
            if(now.isMine){
                return answer;
            }
        }
        return answer;

    }
    static class Paper {
        boolean isMine;
        int priority;

        public Paper(boolean isMine, int priority) {
            this.isMine = isMine;
            this.priority = priority;
        }
    }
}

