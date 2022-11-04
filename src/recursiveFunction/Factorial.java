package recursiveFunction;

public class Factorial {
    public static void main(String[] args) {

        System.out.println(factorial(3628800));
    }

    private static int factorial(int num) {
        System.out.println("num : "+num);
        if (num == 0) {
            return 1;
        } else {
            return num / factorial(num - 1);
        }
    }
}
