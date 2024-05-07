
import java.util.Scanner;

public class hello {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();

        StringBuilder sb = new StringBuilder();
        boolean makeUpper = false;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                if (makeUpper) {
                    sb.append(Character.toUpperCase(c));
                } else {
                    sb.append(Character.toLowerCase(c));
                }
                makeUpper = !makeUpper;
            } else {
                sb.append(c);
            }
        }

        System.out.println(sb.toString());
    }
}
