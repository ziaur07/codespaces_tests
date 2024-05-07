import java.util.Arrays;

public class p4 {
    public static void main(String[] args) {

        int[] arr1 = { 1, 2, 3, 1, 2, 3 };

        for (int i = 0; i < arr1.length; i++) {

            for (int j = i + 1; j < arr1.length; j++) {

                if (arr1[i] == arr1[j]) {
                    arr1[j] = 0;

                }
            }
        }

        System.out.println("\nAfter replacing duplicates with 0:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i] + " ");
        }

    }

}
