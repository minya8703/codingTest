package programmers.stackAndqueue;

import java.util.Stack;

public class 올바른괄호 {
    public static void main(String[] args){
        String s = "()()";
        System.out.println(solution(s));
        String s1 = "(())()";
        System.out.println(solution(s1));
        String s2 = ")()(";
        System.out.println(solution(s2));
        String s3 = "(()(";
        System.out.println(solution(s3));
    }
    static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(') {
                stack.push(c);
            }
            else {
                if(stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty() == true;
    }
}
