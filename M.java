public class M {
    public static void main(String[] args) {
        String outcome = evenChecker(6);
        System.out.println(outcome);

        boolean outcome2 = isEven(6);
        System.out.println(outcome2);

        boolean result = isPos(-5);
        System.out.println(result);

    }

    public static String evenChecker(int a) {
        if (a % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    public static boolean isEven(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPos(int number) {
        return number > 0;
    }

    public static int sequence(int n) {
        if (isPos(n)) {
            for (int i = 0; i < n; i = i + 2) {
                System.out.println(i);
            }
        } else {
            for (int i = n; i <= -1; i++) {
                if (!isEven(i)) {
                    System.out.println(i);
                }
            }
        }

    }

}
