package programmers.stackAndqueue;

import java.util.Arrays;

public class 주식가격 {
    public static void main(String[] args){
        int[] prices = {1, 2, 3, 2, 3};
        System.out.println(Arrays.toString(solution(prices)));
    }
    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for(int i = 0; i<prices.length; i++){

            int price = prices[i];
            int seconds = 0;
            for(int j=i+1; j<prices.length; j++){
                seconds++;
                if(price > prices[j]) break;
            }
            answer[i] = seconds;
        }
        return answer;
    }
}
