package programmers.linearSearch;

import java.util.*;

public class 전화번호목록 {
    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};
        System.out.println(solution(phone_book));
        String[] phone_book1 = {"123", "456", "789"};
        System.out.println(solution(phone_book1));
        String[] phone_book2 = {"12", "123", "1235", "567", "88"};
        System.out.println(solution(phone_book2));
        System.out.println("멘토 결과");
        System.out.println(solutionMt(phone_book));
        System.out.println(solutionMt(phone_book1));
        System.out.println(solutionMt(phone_book2));
    }

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
    public static boolean solutionMt(String[] phone_book) {
        Arrays.sort(phone_book);

        for(int i = 1; i< phone_book.length; i++){
            if(phone_book[i].startsWith(phone_book[i-1]))return false;
            //if(phone_book[i].endsWith(phone_book[i-1]))return false;
        }
        boolean answer = true;
        return answer;
    }
}
