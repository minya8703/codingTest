package doit.chap02;

import java.util.Scanner;

public class ArrayEqual {
    static boolean equals(int[] a, int[] b){
        // 1. 두배열 a, b의 요솟수(길이)를 비교합니다. 요솟수가 다르면 배열이 같지 않은 것이 분명하므로 false를 반환합니다
        if(a.length != b.length)
            return false;

        // 2. 이 for문에서는 두 배열을 처음부터 스캔하면서 요소 a[i]와 b[i]의 값을 비교하는 것을 반복, 그 과정에서 값이 다른 요소를 발견하면 반환문을 실해이하여 false를 반환
        for(int i = 0; i< a.length; i++){
            if(a[i] != b[i])
                return false;
        }

        // 3. 프로그램의 흐름이 여기에 도달하면 for문이 중단되지 않고 끝까지 실행된 경우입니다. 두 배열은 같다라고 판단할 수 있으므로 true를 반환
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("배열의 a의 요솟수 : ");
        int numa = sc.nextInt();

        int[] a =new int[numa];

        for(int i=0; i<numa; i++){
            System.out.print("a[" + i + "]: ");
            a[i] = sc.nextInt();
        }

        System.out.print("배열 b의 요솟수 : ");
        int numb = sc.nextInt();

        int[] b = new int[numb];

        for(int i = 0; i <numb; i++){
            System.out.print("b[" + i + "] : ");
            b[i] = sc.nextInt();

        }
        System.out.println("배열 a와 b는  " + (equals(a, b)?"같습니다":"같지 않습니다"));
    }
}
