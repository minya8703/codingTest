import java.util.Scanner;

public class P11720_220711_2 {
    // 숫자의 합
    public static void main(String[] argnums){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // 입력값을 String 형 변수 sNum에 저장한 후 char[]형 변수로 변환하기
        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();
        int sum = 0;
        for(int i=0; i<cNum.length; i++){
            sum += cNum[i] - '0';// cNum[i]를 정수형을 변환하면서sum에 더하여 누적하기
        }
        System.out.println("sum : " +sum);
    }

}
