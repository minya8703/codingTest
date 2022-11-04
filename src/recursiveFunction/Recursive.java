package recursiveFunction;

public class Recursive {
    public static void main(String[] args) {
        sayHello(5);
    }
    public static void sayHello(int num){
        System.out.println("num : " + num);
        if(num==0){
            return;
        } else {
            System.out.println("hello");
            sayHello(num-1);
        }
    }
}