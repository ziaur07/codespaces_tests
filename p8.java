public class p8 {
    public static void main(String[] args) {
        int[] arr = { 23, 100, 23, 56, 100 };

        int[] arr2 = new int[arr.length];
        int uniqueCount = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }

            }
            if (isUnique) {
                arr2[uniqueCount] = arr[i];
                uniqueCount++;
            }

        }
        for (int i = 0; i < uniqueCount; i++) {
            System.out.println(arr2[i]);
        }
    }
}
