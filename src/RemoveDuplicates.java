import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter String");
        String s = scanner.nextLine();
        System.out.println(removeDuplicateChars(s));
        scanner.close();
    }

    public static String removeDuplicateChars(String s) {
        String sb = "";
        for (char ch : s.toCharArray()) {
            if (sb.contains(String.valueOf(ch))) {
            } else sb += ch;
        }
        return sb;
    }
}
