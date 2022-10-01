package programmers.map;

import java.util.*;

public class 위장 {
    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        String[][] clothes1 = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};

        System.out.println(solution(clothes));
        System.out.println(solution(clothes1));
    }
    public static int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        // 위장용품의 개수를 구한다
        for(String[] c : clothes){
            String type = c[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }
        System.out.println(map);
        // 각 개수의 +1을 모두 곱한다.
        int answer = 1;
        var iter = map.values().iterator();
        while (iter.hasNext()){
            answer *= iter.next() +1;
             System.out.println("answer : "+ answer);
        }
        // -1 해서 리턴한다.
         return answer-1;
    }
}
