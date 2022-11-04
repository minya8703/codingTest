package programmers.basic;

import java.util.Arrays;

public class 옹알이 {
    public static void main(String[] args) {
        String[] babbling = {"aya", "yee", "u", "maa"};
        System.out.println(solution(babbling));
        String[] babbling1 = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        System.out.println(solution(babbling1));
    }
    public static int solution(String[] babbling) {
        int answer = 0;
        for(int i=0; i<babbling.length; i++){
            babbling[i] = babbling[i].replaceAll("ayaaya", "1").replaceAll("yeye", "1").replaceAll("woowoo", "1").replaceAll("mama", "1");
            if(babbling[i].contains("aya")) {
                babbling[i] = babbling[i].replaceAll("aya", "");
            }
            if(babbling[i].contains("ye")) {
                babbling[i] = babbling[i].replaceAll("ye", "");
            }
            if(babbling[i].contains("woo")) {
                babbling[i] = babbling[i].replaceAll("woo", "");
            }
            if(babbling[i].contains("ma")) {
                babbling[i] = babbling[i].replaceAll("ma", "");
            }
            if(babbling[i].equals("")){
                answer++;
            }
        }
        System.out.println(Arrays.toString(babbling));
        return answer;
    }
}
