package programmers.exhaustiveSearch;

public class 최소직사각형 {
    public static void main(String[] args){
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(solution(sizes));

        int[][] sizes1 = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
        System.out.println(solution(sizes));
    }
    public static int solution(int[][] sizes) {
        int larger = 0, smaller = 0;
        for (int[] size : sizes) {
            int width = size[0];
            int height = size[1];
            larger = Math.max(larger, Math.max(width, height));
            smaller = Math.max(smaller, Math.min(width, height));
        }
        return larger * smaller;
    }
}
