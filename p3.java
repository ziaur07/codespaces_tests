import java.util.Arrays;
import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N the array: ");

        int N = scanner.nextInt();
        int[] arr = new int[N];

        System.out.println(" enter elements of  the array: ");
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("elements of  the array are: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(" index " + i + " " + arr[i]);
        }

        System.out.println("Enter another element: ");
        int element = scanner.nextInt();

        arr = Arrays.copyOf(arr, N + 1);
        arr[N] = element;
        System.out.println("The sorted array is: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(" index " + i + " " + arr[i]);
        }

    }

}
