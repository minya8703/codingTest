import java.util.ArrayList;
import java.util.Scanner;

public class test2_01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        solution(n, arr);
    }
    public static void solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for(int i=1; i<n; i++){
            if(arr[i]>arr[i-1]) {
                answer.add(arr[i]);
            }
        }
        for(int x: answer){
            System.out.print(x+" ");
        }
    }
}
