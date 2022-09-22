package doit.chap06;

import java.util.*;

public class itiscodingTest02 {
    // 성적이 낮은 순서로 학생 출력하기
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("몇 명의 학생입니까? : ");
        int stnum = sc.nextInt();

        List<Student> studentList = new LinkedList<>();
        for(int i=0; i<stnum; i++){
            System.out.print(i+"번째 학생이름을 입력 : ");
            String name = sc.next();
            System.out.print(i+"번째 학생점수를 입력 : ");
            int score = sc.nextInt();
            studentList.add(new Student(name, score));
        }
        Collections.sort(studentList);

        for(Student student : studentList){
            System.out.println("이름 : " + student.getName()+ " 점수 : " + student.getScore());
        }
    }

}
class Student implements Comparable<Student>{
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    // 정렬 기준은 '점수가 낮은 순서'
    @Override
    public int compareTo(Student other) {
        if(this.score < other.score){
            return -1;
        }
        return 1;
    }
}
