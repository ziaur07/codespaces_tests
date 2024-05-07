import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 strings:");
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();

        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 0; i < input1.length(); i++) {
            char c = input1.charAt(i);
            boolean found = false;

            for (int j = 0; j < input2.length(); j++) {
                if (c == input2.charAt(j)) {
                    found = true;
                    count = count + 1;
                    break;
                }
            }

            if (!found) {
                sb.append(c);
                count = 1;
            }

        }
        System.out.println("" + count);

    }

}