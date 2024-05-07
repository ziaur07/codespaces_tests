public class r {
    public static void main(String[] args) {
        System.out.println(factorialCalc(7));
    }

    public static int factorialCalc(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorialCalc(n - 1);
        }

    }
}
