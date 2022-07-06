import java.util.Scanner;

public class test1_04 {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("입력할 단어 갯수");
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

    return new StringBuilder(str).reverse().toString();
    }
}
