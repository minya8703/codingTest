import java.util.*;
/*
- 자료구조/알고리즘: HashSet
- 시간 복잡도 : O(mn)
- 공간 복잡도 : O(n)
- 소요 시간: 30분
*/
public class 전화번호목록 {
    public static boolean solution(String[] phone_book) {
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(phone_book));

        for (String str: phone_book) {
            for (int i = 0; i < str.length(); i++) {
                String temp = str.substring(0, i);
                if (hashSet.contains(temp)){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        String[] str = {"119", "97674223", "1195524421"};
        System.out.println(solution(str));
        String[] str1 = {"123","456","789"};
        System.out.println(solution(str1));
        String[] str2 = {"934793", "34", "44", "9347"};
        System.out.println(solution(str2));

    }
}
