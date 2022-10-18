package doitAlgorithm.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 버블정렬_버블소트프로그램016 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // N(데이터 개수) A(데이터 배열, 단 클래스를 데이터로 담는 배열)
        int n = Integer.parseInt(br.readLine());
        mData[] arrData = new mData[n];
        // for(N만큼 반복하기){
        //     A 배열 저장하기
        // }
        for(int i=0; i<n; i++) {
            arrData[i] = new mData(Integer.parseInt(br.readLine()), i);
        }
        // A배열 정렬하기
        Arrays.sort(arrData);
        int max = 0;
        // for(N만큼 반복하기){
        //     A[i]의 정렬전 index - 정렬후 index 계산의 최댓값을 찾아 저장하기
        // }
        for(int i=0; i<n; i++){
            if(max < arrData[i].index-1){
                max = arrData[i].index-1;
            }
        }
        System.out.println(max + 1);
        // 최댓값 + 1을 정답으로 출력하기
        //
        // 별도 클래스 선언

    }
    static class mData implements Comparable<mData> {
        // mData(데이터 표현){
        //     index, value를 가지며
        int value;
        int index;

        public mData(int value, int index){
            super();
            this.value = value;
            this.index = index;
        }

        //     value 기준 오름차순 정렬함수 Comparable 구현
        @Override
        public int compareTo(mData o) {
            return this.value - o.value;
        }
        // }
    }
}
