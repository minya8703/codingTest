package programmers.graph;

public class 네트워크 {
    static boolean[] connected;
    public static int solution(int n, int[][] computers) {
        int answer = 0;
        connected = new boolean[n];
        for(int i=0; i<n; i++) {
            if(!connected[i]) {
                dfs(i, computers);
                answer++;
            }
        }
        return answer;
    }

    private static void dfs(int idx, int[][] computers){
        connected[idx] = true;
        for(int i=0; i < computers[idx].length; i++){
            if(computers[idx][i] == 1 && !connected[i]) dfs(i, computers);
        }

    }
    public static void main(String[] args){
        int n = 3;
        int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        System.out.println(solution(n, computers));
    }
}
