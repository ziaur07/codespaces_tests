public class reccursion {
    public static void main(String[] args) {
        System.out.println(recursive_method(4));

    }

    public static int recursive_method(int num) {
        if (num == 0) {

            return num;
        } else {
            return num + recursive_method(num - 1);
        }

    }
}
