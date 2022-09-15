import java.util.Arrays;

/*
- 자료구조/알고리즘: LinkedList
- 시간 복잡도 : O(n)
- 공간 복잡도 : O(n)
- 소요 시간: 30분
*/
public class K번째수 {
    public static int[] solution(int[] array, int[][] commands) {
        //[5, 6, 3]
        int[] answer = new int[commands.length];
        int[] temp;
        for(int i=0; i<commands.length; i++){
            temp = new int[commands[i][1]-commands[i][0]+1] ;
            int count = 0;
            for(int j=commands[i][0]; j<commands[i][1]+1; j++){
                temp[count] = array[j-1];
                count++;
            }
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(Arrays.toString(solution(array, commands)));
    }
}
