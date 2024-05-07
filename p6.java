import java.util.Scanner;
import java.util.Arrays;

public class p6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter N");
        int N = sc.nextInt();

        int[] arr = new int[N];

        System.out.println("enter elements of the array: ");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("enter N2");

        int N2 = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {

            if (N2 == arr[i]) {
                System.out.println("Element found at index: " + i);
                break;
            } else {
                System.out.println("Element not found");

            }

        }

    }
}
