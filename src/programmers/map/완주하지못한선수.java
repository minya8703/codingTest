package programmers.map;

import java.util.*;

/*
- 자료구조/알고리즘: HashMap
- 시간 복잡도 : O(n)
- 공간 복잡도 : O(n)
- 소요 시간: 15분
*/
public class 완주하지못한선수 {
    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion ={"stanko", "ana", "mislav"};
        System.out.println(solution(participant, completion));
        System.out.println("맨토 결과");
        System.out.println(solutionMt(participant, completion));
        System.out.println("맨토 결과1");
        System.out.println(solutionMt1(participant, completion));

    }
    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> persons = new HashMap<>();
        for(String name : participant){
            persons.put(name, persons.getOrDefault(name, 0) + 1);
        }
        System.out.println(persons);
        for(String name : completion){
            persons.put(name, persons.get(name) - 1);
        }
        System.out.println(persons);
        for(String name : persons.keySet()){
            if (persons.get(name) > 0)
            {
                answer = name;
                break;
            }
        }
        System.out.println(persons);
        return answer;
    }
    public static String solutionMt(String[] participant, String[] completion) {

        Map<String, Integer> players = new HashMap<>();
        for(String p : participant){
            players.put(p, players.getOrDefault(p, 0)+1);
        }
        for(String c :  completion) {
            int n = players.get(c) -1;
            if(n==0)players.remove(c);
            else players.put(c, n);

        }
        return players.keySet().iterator().next();
    }
    public static String solutionMt1(String[] participant, String[] completion) {
        Arrays.sort(participant); // n
        Arrays.sort(completion); // n-1

        for(int i=0; i<completion.length; i++){
            if(!participant[i].equals(completion[i])) return participant[i];
        }
        return participant[participant.length - 1];
    }
}
