package programmers.basic;

public class 개미군단 {
    public static void main(String[] args) {

        int hp = 23;
        System.out.println(solution(hp));

    }
    public static int solution(int hp) {
        int[] antArr = {5, 3, 1};
        int answer = 0;
        for(int i=0; i<antArr.length; i++){
            if(hp!=0){
                System.out.println(" hp: "+hp+" antArr : "+antArr[i]);
                answer = answer + (hp / antArr[i]);
                hp = hp % antArr[i];
            }
        }
        return answer;
    }

}
