package doit.chap02;

import java.util.*;

public class MaxOfarrayRand {
    public static void main(String[] args){
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("키의 최대 값을 구합니다.");
        System.out.print("사람수 : ");
        int num = sc.nextInt();

        int[] height =new int[num];

        System.out.println("키 값은 아래와 같습니다.");
        for( int i = 0; i< num; i++) {
            height[i] = 100 + rand.nextInt(90);
            System.out.println("height[" + i + "]:" + height[i]);
        }
        System.out.println("Max num is this : " + maxOf(height));
    }
    static int maxOf(int[] a){
        int max = a[0];
        for(int i = 1; i< a.length; i++){
            if(a[i] > max)
                max = a[i];
        }
        return max;
    }
}
