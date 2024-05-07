import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 strings:");
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input1.length(); i++) {

            char c = input1.charAt(i);
            boolean found = false;

            for (int j = 0; j < input2.length(); j++) {
                if (c == input2.charAt(j)) {
                    found = true;
                    break;
                }

            }

            if (!found) {
                sb.append(c);
            }
        }
        System.out.println("" + sb);

    }

}
