import java.util.LinkedList;
import java.util.List;
/*
- 자료구조/알고리즘: LinkedList
- 시간 복잡도 : O(n)
- 공간 복잡도 : O(n)
- 소요 시간: 30분
*/
public class 같은숫자는싫어 {
    public static int[] solution(int []arr) {
        int[] answer;
        List<Integer> list = new LinkedList<>();
        int temp = -1;
        for(int x:arr){
            if(temp!=x){
                list.add(x);
                temp = x;
            }
        }
        answer = new int[list.size()] ;
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args){
        int [] arrs ={1,1,3,3,0,1,1};
        System.out.println(solution(arrs));
        int [] arrs1 ={4,4,4,3,3};
        System.out.println(solution(arrs1));
    }

}
