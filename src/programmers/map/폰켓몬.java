package programmers.map;

import java.util.*;

public class 폰켓몬 {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 3};
        System.out.println(solution(nums));
        System.out.println("멘토 결과 : "+solutionMt(nums));
        int[] nums1 = {3, 3, 3, 2, 2, 4};
        System.out.println(solution(nums1));
        System.out.println("멘토 결과 : "+solutionMt(nums1));
        int[] nums2 = {3, 3, 3, 2, 2, 2};
        System.out.println(solution(nums2));
        System.out.println("멘토 결과 : "+solutionMt(nums2));
        int[] nums3 = {1, 2, 3, 4, 7, 9, 11, 14, 18};
        System.out.println(solution(nums3));
        System.out.println("멘토 결과 : "+solutionMt(nums3));
    }

    public static int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> pMonsters = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            pMonsters.add(nums[i]);
        }
        Iterator<Integer> it = pMonsters.iterator();
        while (it.hasNext()) {
            it.next();
            if (nums.length / 2 > answer) {
                answer++;
            }
        }
        return answer;
    }

    public static int solutionMt(int[] nums) {
        int answer = 0;
        // 포켓몬의 종류의 갯수를 구한다.
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n, 0);
        }
        int n1 = map.keySet().size();
        // 배열 크기의 1/2 을 구한다.
        int n2 = nums.length/ 2;
        // 최소값을 선택한다.
        return Math.min(n1, n2);
    }
}
