package doitAlgorithm.dataStructure;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 백준 11659
 * 시간 제한 0.5초
 * */
public class 구간합_구간합003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // suNo(숫자 개수), quizNo(질의 개수) 저장하기
        int suNo = Integer.parseInt(st.nextToken());
        int quizNo = Integer.parseInt(st.nextToken());
        long[] s = new long[suNo + 1];
        st = new StringTokenizer(br.readLine());
        for(int i = 1;i <= suNo ; i++){
            s[i] = s[i-1] + Integer.parseInt(st.nextToken());
        }
        for(int q = 0; q<quizNo; q++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            System.out.println(s[j] - s[i-1]);
        }
        // for(숫자 개수만큼 반복하기) {
        //    합 배열 생성하기 (S[i] = S[i-1] + A[i])
        // }
        // for(질의 개수만큼 반복하기) {
        //    질의 범위받기(i ~ j)
        //    구간 합 출력 하기(S[j] - S[i-1])
        // }

    }
}
