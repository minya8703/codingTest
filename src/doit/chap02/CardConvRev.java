package doit.chap02;

import java.util.Scanner;

// 입력받은 10진수를 2진수 ~ 36
public class CardConvRev {
    static int cardConvR(int x, int r, char[] d){
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            if (digits == 0) {
                System.out.println(r + " |    " + x);
            } else {
                System.out.println(r + " |    " + x + " … " + x % r);
            }
            System.out.println("+---------");
            d[digits++] = dchar.charAt(x % r);// r로 나눈 나머지를 저장
            x /= r;
        } while (x != 0);
        System.out.println("       " + 0 + " … " + x % r);
        return digits;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int no;
        int cd;
        int dno;
        int retry;
        char[] cno = new char[32]; // 변환후 각 자리의 숫자를 넣어 두는 문자의 배열

        System.out.println("10진수를 기수 변환합니다.");
        do{
            do{
                System.out.print("변환하는 음이 아닌 정수 : ");
                no = sc.nextInt();
            } while (no <0);
            do{
                System.out.print("어떤 진수로 변환할까요? (2~36)");
                cd = sc.nextInt();
            } while (cd < 2 || cd >36);
            dno = cardConvR(no, cd, cno);

            System.out.print(cd + "진수로는 ");
            for(int i = dno -1; i>=0; i--)
                System.out.print(cno[i]);
            System.out.println("입니다.");

            System.out.print("한 번 더 할까요? (1. Yes/ 2. No)");
            retry = sc.nextInt();
        } while (retry == 1);
    }
}
