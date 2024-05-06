public class hello {
    public static void main(String[] args) {
        System.out.println(factorial_calculate(10));
    }

    static int factorial_calculate(int n) {
        if (n != 0) {
            return n * factorial_calculate(n - 1);
        } else {
            return 1;
        }
    }
}