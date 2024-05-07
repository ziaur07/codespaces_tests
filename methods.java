public class methods {
    public static void main(String[] args) {
        boolean outcome = isTriangle(4, 8, 9);
        System.err.println(outcome);

        double outcome2 = triArea(4, 8, 9);
        System.err.println(outcome2);

    }

    public static boolean isTriangle(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }

    public static double triArea(int d, int e, int f) {
        double s = (d + e + f) / 2;
        return Math.sqrt(s * (s - d) * (s - e) * (s - f));
    }
}
