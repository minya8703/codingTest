import java.util.Scanner;

public class test1_06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
    public static String solution(String str){
        String answer="";
        for(int i=0; i<str.length(); i++) {
            // System.out.println(str.charAt(i)+" " + " " +str.indexOf(str.charAt(i)));
            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }
        return answer;

    }
}