import java.util.Scanner;

public class p7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter N");
        int N = sc.nextInt();
        double max = 0.0;
        double min = 0.0;
        double sum = 0.0;

        double[] arr = new double[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextDouble();

        }

        for (int i = 0; i < arr.length; i++) {

            max = arr[0];
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];

            }
            sum = sum + arr[i];

        }

        System.out.println("max element is: " + max);
        System.out.println("max element is: " + min);
        System.out.println("sum: " + sum);

    }

}
