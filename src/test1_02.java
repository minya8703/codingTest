import java.util.Scanner;

public class test1_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));


    }
    public static String solution(String str){
        String answer= "";
        for(char x : str.toCharArray()){
            if(Character.isLowerCase(x)){
                answer += Character.toUpperCase(x);
            }else{
                answer += Character.toLowerCase(x);
            }

        }
        return answer;

    }
}
