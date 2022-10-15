package doitAlgorithm.dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 스택과큐_스택으로오름차순수열011 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // N(수열 개수) A[](수열 배열)
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        // 수열 배열 채우기
        for(int i = 0; i< n;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Stack<Integer> stack = new Stack<>();
        StringBuffer bf = new StringBuffer();
        int num = 1; // 오름 차순
        boolean result  = true;
        for(int i=0; i< arr.length; i++){
            // for(N만큼 반복){
            int su = arr[i];// 현재 수열의 수
            if(su>=num){
                //     if(현재 수열의 값 >= 오름차순 자연수) {
                while(su >=num){
                    //         while(값이 같아질 때까지){
                    stack.push(num++);
                    bf.append("+\n");
                    //             push()
                    //             (+)저장
                }
                //         }
                stack.pop();
                bf.append("-\n");
                //         pop()
                //         (-)저장
            } else {// 현재 수열 값 < 오름차순 자연수 : pop()을 수행해 수열 원소를 꺼냄
                //     } else if(현재 수열의 값 <  오름차순 자연수) {
                int nowNum = stack.pop();
                //         pop()
                // 스택의 가장 위의 수가 만들어야 하는 수열의 수보다 크면 수열을 출력할 수 없음
                if(nowNum > su){
                    //         if(스택 pop 결괏값 > 수열의 수) NO 출력
                    //         else (-)저장
                    System.out.println("NO");
                    result = false;
                    break;
                    //     }
                    // }
                } else {
                    bf.append("-\n");
                }
            }
        }
        // if(-값을 출력한 저거이 없으면) 저장한 값 출력
        if(result) {
            System.out.println(bf.toString());
        }
    }
}
