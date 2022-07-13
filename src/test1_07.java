import java.util.Scanner;

public class test1_07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
    public static String solution(String str){
        String tmp = new StringBuilder(str).reverse().toString().toLowerCase();
        str = str.toLowerCase();
        if(str.equals(tmp)){
            return "YES";
        }
        return "NO";
    }
}