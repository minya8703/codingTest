package doitAlgorithm.dataStructure;

import java.io.*;
import java.util.Stack;

public class 스택과큐_오큰수구하기012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // N(수열 개수) A[수열 배열] ans[](정답 배열)
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] result = new int[n];
        String[] str = br.readLine().split(" ");
        // 수열 배열 채우기
        // 최초 스택 초기화 하기
        for(int i = 0; i<n;i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(0);//처음에는 항상 스택이 비어 있으므로 최최값을 push 해 초기화
        // for(N만큼 반복) {
        for(int i=1; i<n; i++) {
            //     while(스택이 비어 있지 않고, 현재 수열 값이 top에 해당하는 수열보다 클 때 까지 반복) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]){
                result[stack.pop()]  = arr[i];
                //         pop
                //         정답 배열에 오큰수를 현재 수열로 저장하기
                //     }
            }
            stack.push(i);
            //     현재 수열을 스택에 push
            // }
        }
        while (!stack.isEmpty()) {
            // while(스택이 빌 때까지){
            //     스택에 있는 인덱스의 정답 배열에 -1 저장하기
            result[stack.pop()] = -1;
            // }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0;i<n; i++){
            bw.write(result[i] + " ");
        }
        // 정답 배열 출력하기
        bw.write("\n");
        bw.flush();
    }
}
