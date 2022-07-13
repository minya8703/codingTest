import java.util.Scanner;

public class P11720_220711 {
    // 숫자의 합
    public static void main(String[] argnums){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] sumNums = new int[num];
        int sum = 0;
        for(int i=0; i<num; i++){
            sumNums[i]= sc.nextInt();
            sum += sumNums[i];
        }
        System.out.println("sum : " +sum);
    }

}
