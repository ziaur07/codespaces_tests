import java.util.Scanner;

public class p9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter N");
        int N = sc.nextInt();
        int N2 = sc.nextInt();

        System.out.println("enter elements of the array1: ");

        int[] arr = new int[N];
        int[] arr2 = new int[N2];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter elements of the array2: ");

        for (int j = 0; j < N2; j++) {
            arr2[j] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < N2; i++) {
            for (int j = 0; j < N; j++) {
                if (arr2[i] == arr[j]) {
                    count++;
                    break;
                }
            }
        }

        if (count == N2) {
            System.out.println("Array2 is a subset of Array1");
        } else {
            System.out.println("Array2 is not a subset of Array1");
        }
    }
}