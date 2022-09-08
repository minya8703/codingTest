package doit.chap02;

import java.util.Scanner;

public class ReverseArray {
    // 배열 요소 a[idx1]과a[idx2]의 값을 바꿈
    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
    }

    // 배열 a의 요소를 역순으로 정렬
    static void reverse(int[] a){
        for(int i=0; i<a.length / 2; i++){
            swap(a, i, a.length - i -1);
        }
    }

    // 배열 a의 모든 요소의 합계를 구하여 반환하는 메서드를 작성하시오
    static int sumOf(int[] a){
        int sum = 0;
//        for(int i=0; i<a.length; i++){
//            sum += a[i];
//        }
        for(int i : a){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = sc.nextInt();

        int[] x = new int[num]; // 요솟수가 num인 배열
        for(int i = 0; i<num; i++){
            System.out.print("x[" + i + "]:");
            x[i] = sc.nextInt();
        }
        reverse(x);

        System.out.println("요소를 역순으로 정렬");
        for( int i = 0; i< num; i++){
            System.out.println("x[" + i + "] = "+ x[i]);
        }

        System.out.println("요소의 합계 : " + sumOf(x));
    }
}
