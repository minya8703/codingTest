package doitAlgorithm.dataStructure;

import java.util.Scanner;
/*
* 백준 11720
* 시간 제한 1초
* */
public class 배열리스트_숫자의합구하기001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // N값 입력받기
        int n = sc.nextInt();
        int sum = solution(sc, n);
        System.out.print(sum);

    }

    private static int solution(Scanner sc, int n) {
        // 길이 N의 숫자를 입력 받아 String 형 변수 sNum에 저장하기
        String sNum = sc.next();
        // sNum을 다시 char[]형 변수 cNum에 변환하여 저장하기
        char[] cNum = sNum.toCharArray();
        // int형 변수 sum 선언하기
        int sum = 0;
        // for(cNum 길이 만큼 반복하기){
        // &nbsp; &nbsp; &nbsp; &nbsp;배열의 각 자릿값을 정수형으로 변환하여  sum에 더하여 누적
        // }
        for (int i = 0; i< n; i++){
            sum += cNum[i]-'0';
//            sum += cNum[i]-48;
        }
        return sum;
    }
}
