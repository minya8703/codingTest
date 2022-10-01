package programmers.linearSearch;

import java.util.Arrays;

public class 스킬트리 {
    public static void main(String[] args) {
        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
        System.out.println(solution(skill, skill_trees));
        System.out.println("방법2");
        System.out.println(solution1(skill, skill_trees));
    }

    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for (String s : skill_trees) {
            String s2 = s.replaceAll("[^" + skill + "]", "");
            if (skill.startsWith(s2)) answer++;
        }
        return answer;
    }

    public static int solution1(String skill, String[] skill_trees) {
        return (int) Arrays.stream(skill_trees).map(s -> s.replaceAll("[^" + skill + "]", "")).filter(s -> skill.startsWith(s)).count();
    }
}
