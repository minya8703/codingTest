import java.util.Scanner;

public class test1_04_2 {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i=0; i<n; i++){
            str[i] = sc.next();
        }
        for(String x: str){
            System.out.println(solution(x));
        }

    }
    public static String solution(String str){
        char[] charStr = str.toCharArray();
        char[] nChar = new char[str.length()];
        String answer = "";
        for(int i=0; i<charStr.length; i++){
            nChar[i] = charStr[charStr.length-i];
        }
        answer = String.valueOf(nChar);
    return answer;
    }
}
