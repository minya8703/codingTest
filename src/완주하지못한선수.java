import java.util.HashMap;

public class 완주하지못한선수 {
    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion ={"stanko", "ana", "mislav"};
        System.out.println(solution(participant, completion));

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
}
