package doitAlgorithm.sort;

import java.io.*;

public class 기수정렬_수정렬하기022 {
    static int[] arr;
    static long result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // N(정렬할 수 개수)
        int n = Integer.parseInt(br.readLine());
        // A(정렬할 배열 선언하기)
        arr = new int[n];
        // for(N의 개수만큼 반복하기){
        //     A 배열 저장하기
        // }
        for(int i = 0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        // 기수 정렬 함수 수행하기
        radix_Sort(arr, 5);
        // 정렬된 A배열 출력하기
        for(int i=0; i<n; i++){
            bw.write(arr[i] + "\n");
        }
        bw.flush();
        bw.close();
    }
    public static void radix_Sort(int[] arr, int max_size){
        // // 기수 정렬 함수 구현하기
        // // 변수 선언부
        // bucket(현재 자릿수들의 문포를 합 배열의 형태로 알려주는 배열)
        // ex: bucket[4] → 현재 기분 자릿갑이 0~4까지 몇개의 데이터가 있는지 저장하기
        // output(임시 정렬을 위한 배열)
        int[] output = new int[arr.length];
        // jarisu(현재 자릿수를 표현하는 수)
        int jarisu = 1;
        int count = 0;
        // // 로직 부분
        while(count != max_size){
            // while(최대 자릿수만큼 반복하기){
            //     현재 기분 자릿수를 기준으로 A배열 데이터를 bucket에 count
            //     합 배열 공직으로 bucket을 합 배열 형태로 변경하기
            int[] bucket = new int[10];
            //     for(N의 개수만큼 반복하기){
            //         bucket값을 이용행 현재 기준 자릿수로 데이터를 정렬하기
            //         output 배열에 저장하기
            //     }
            for(int i =0; i<arr.length; i++){
                bucket[(arr[i]/ jarisu) % 10]++;// 일의 자리부터 시작
            }
            for(int i = 1; i<10; i++){// 합배열을 사용하여 index 계산하기
                bucket[i] += bucket[i-1];
            }
            for(int i = arr.length - 1; i>=0; i--) {// 현재 자릿수를 기준으로 정렬하기
                output[bucket[(arr[i] / jarisu % 10)] -1] = arr[i];
                bucket[(arr[i]/ jarisu) % 10]--;
            }
            for(int i=0; i<arr.length; i++){
                // 다음 자릿수를 이동하기 위해 현재 자릿수 기준 정렬 데이터 저장하기
                //     for(N의 개수만큼 반복하기){
                //         다음 자릿수 이동을 위해 A배열에 output 데이터 저장하기
                //     }
                arr[i] = output[i];
            }
            //     jarisu = jarisu * 10
            jarisu = jarisu * 10; // 자릿수 증가시키기
            count++;
            // }
        }
    }
}
