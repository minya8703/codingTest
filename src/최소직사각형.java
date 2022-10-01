/*
- 자료구조/알고리즘: 배열
- 시간 복잡도 : O(nm)
- 공간 복잡도 : O(1)
- 소요 시간: 15분
*/
public class 최소직사각형 {
    public static int solution(int[][] sizes) {
        int answer = 0;
        int hSize = 0;
        int wSize = 0;
        for(int i=0; i<sizes.length; i++){
            //가로보다 세로가 더 길다면 두 인덱스 변경
            int temp = 0;
            if(sizes[i][0] < sizes[i][1]){
                temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }

            if(sizes[i][0]>wSize){
                wSize = sizes[i][0];
            }
            if(sizes[i][1]>hSize){
                hSize = sizes[i][1];
            }
        }
        answer = wSize * hSize;
        return answer;
    }
    public static void main(String[] args){
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(solution(sizes));
    }
}
