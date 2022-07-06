import java.util.ArrayList;
import java.util.Scanner;

public class test1_04_3 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        String[] str=new String[n];
        for(int i=0; i<n; i++){
            str[i]=kb.next();
        }
        for(String x : solution(n, str)){
            System.out.println(x);
        }
    }
    public static ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x: str){

            char[] charStr = x.toCharArray();
        char[] nChar = new char[x.length()];
        for (int i = 0; i < charStr.length; i++) {
            nChar[i] = charStr[charStr.length - i];
        }
        answer.add(String.valueOf(nChar));
    }
        return answer;
    }
}
