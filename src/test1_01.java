import java.util.Scanner;

public class test1_01 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        System.out.println(solution(str, c));
    }

    public static int solution(String str, char c) {
        int answer = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);
        for(char x : str.toCharArray()){
            if(x==c) answer++;
        }
        return answer;

    }
}
