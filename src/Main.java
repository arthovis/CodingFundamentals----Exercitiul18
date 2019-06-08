import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] array = input.nextLine().split(" ");
                for (String e : array) {
            if (Pattern.matches("^[a-zA-Z0-9]+$", e))
                e = e.replaceAll("\\d", "");
            System.out.print(e);
        }
    }
}
