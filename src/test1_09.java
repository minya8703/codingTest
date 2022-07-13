import java.util.Scanner;

public class test1_09 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(solution(str));
    }
    public static int solution(String str){
        String answer = "";
        for(char x : str.toCharArray()){
            if(Character.isDigit(x)){
                answer+=x;
            }
        }
        return Integer.parseInt(answer);
    }
}