package programmers.basic;

import java.util.Arrays;
import java.util.Collections;

public class 진료순서정하기 {
    public static void main(String[] args) {
        int[] emergency = {3, 76, 24};
        System.out.println(Arrays.toString(solution(emergency)));
    }
    public static int[] solution(int[] emergency) {
        Integer[] sortEmergency = Arrays.stream(emergency).boxed().toArray(Integer[]::new);
        int[] answer = new int[emergency.length];
        Arrays.sort(sortEmergency, Collections.reverseOrder());
        for(int i=0; i<emergency.length; i++){
            for(int j=0; j<answer.length; j++){
                System.out.println("emergency"+i+" : "+ emergency[i]+" sortEmergency[j] : "+sortEmergency[j]);
                if(emergency[i]==sortEmergency[j]){
                    answer[i] = j+1;
                }
            }
        }
        return answer;
    }
}
