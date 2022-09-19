import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/*
- 자료구조/알고리즘: 해시
- 시간 복잡도 : O(mn)
- 공간 복잡도 : O(n)
- 소요 시간: 30분
*/
public class 포켓몬 {
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

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 3};
        System.out.println(solution(nums));
        int[] nums1 = {3, 3, 3, 2, 2, 4};
        System.out.println(solution(nums1));
        int[] nums2 = {3, 3, 3, 2, 2, 2};
        System.out.println(solution(nums2));
        int[] nums3 = {1, 2, 3, 4, 7, 9, 11, 14, 18};
        System.out.println(solution(nums3));
    }
}
