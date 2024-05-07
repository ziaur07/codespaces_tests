import java.util.Scanner;

public class p10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter N");
        int N = sc.nextInt();
        System.out.println("enter elements of the array1: ");
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("enter target value ");

        int target = sc.nextInt();
        int count = 0;

        outerLoop: for (int i = 0; i < N; i++) {
            boolean notFound = true;

            for (int j = 1; j < N; j++) {
                if (arr[i] + arr[j] == target) {
                    count++;

                    System.out.println("The pair is: " + i + arr[i] + " + " + j + arr[j]);
                    break outerLoop;
                }

            }

        }

    }
}
