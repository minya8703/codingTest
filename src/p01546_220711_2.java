import java.util.Scanner;

public class p01546_220711_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a[] = new int[num];
        long sum = 0;
        long max = 0;
        for(int i = 0; i<num; i++){
            a[i] =sc.nextInt();
            if(a[i] > max){
                max = a[i];
            }
            sum = sum + a[i];
        }
        // 한 과목과 관련된 수식을 총합한 후 관령도니 수식으로 변환해 로직이 간단해짐
        System.out.println(sum * 100.0 / max / num);
    }
}
