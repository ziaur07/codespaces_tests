import java.util.Scanner;
import java.util.Arrays;

public class p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter N");
        int N = sc.nextInt();

        int[] arr = new int[N];

        System.out.println("enter elements of the array: ");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + "");
        }
        System.out.println();

        int[] newArr = new int[N];

        for (int i = arr.length - 1; i >= 0; i--) {
            int newIndex = arr.length - 1 - i;
            newArr[newIndex] = arr[i];
            System.out.print(arr[i] + "");
        }

    }

}
