import java.util.Scanner;

public class dataType {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of inputs: ");
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            System.out.println("Enter input " + (i + 1) + ": ");
            int input = sc.nextInt();

        }

    }

}
