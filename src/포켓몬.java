import java.util.HashMap;
import java.util.Map;

public class 포켓몬 {
        public static int solution(int[] nums) {
            int answer = 0;
             HashMap<Integer, Integer> pMonsters = new HashMap<>();

            for(int i = 0; i<nums.length; i++){
                pMonsters.put(nums[i], i);
            }
            for(int pMonKey : pMonsters.keySet())
            if(pMonsters.containsKey(pMonKey)) {
                if (nums.length / 2 > answer) {
                    answer++;
                }
            }
            System.out.println(pMonsters);

            return answer;
        }

    public static void main(String[] args){
        int[] nums = {3,1,2,3};
        System.out.println(solution(nums));
        int[] nums1 = {3,3,3,2,2,4};
        System.out.println(solution(nums1));
        int[] nums2 = {3,3,3,2,2,2};
        System.out.println(solution(nums2));
        int[] nums3 = {1,2,3,4,7,9,11, 14, 18};
        System.out.println(solution(nums3));
    }
}
