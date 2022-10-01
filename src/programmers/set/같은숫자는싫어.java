package programmers.set;

import java.util.*;

public class 같은숫자는싫어 {
    public static void main(String[] args){
        int[]arr = {1,1,3,3,0,1,1};
        int[] arr1 = {4,4,4,3,3};
        System.out.println(Arrays.toString(solution(arr)));
        System.out.println(Arrays.toString(solution(arr1)));
        System.out.println("멘토 결과");
        System.out.println(Arrays.toString(solution(arr)));
        System.out.println(Arrays.toString(solution(arr1)));
    }
    public static int[] solution(int []arr) {
        List<Integer> list = new LinkedList<>();
        int temp = -1;
        for(int x:arr){
            if(temp!=x){
                list.add(x);
                temp = x;
            }
        }
        int[] answer = new int[list.size()] ;
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
    public static int[] solutionMt(int []arr) {
        List<Integer> list = new LinkedList<>();

        int last = -1;
        for(int i=0; i<arr.length; i++){
            if(last == arr[i]) {
                continue;
            }
            last = arr[i];
            list.add(arr[i]);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
