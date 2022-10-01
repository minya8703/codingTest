package programmers.set;

import java.util.*;

public class 끝말잇기 {
    public static void main(String[] args){
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream"};
        System.out.println(solution(words));
        String[] words1 = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        System.out.println(solution(words1));

    }
    public static boolean solution(String[] words) {
        Set<String> set = new HashSet<>();
        set.add(words[0]);
        char last = words[0].charAt(words[0].length()-1);
        for(int i=1; i<words.length; i++){
            String word = words[i];
            char first = word.charAt(0);
            if(last != first) return false;
            if(!set.add(words[i])) return false;

            last = word.charAt(word.length()-1);
        }
        return true;
    }
}
