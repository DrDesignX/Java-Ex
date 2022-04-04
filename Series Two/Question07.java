import java.util.Arrays;
import java.util.Scanner;

class Question07 {
    public static void main(String[] args) {
        Scanner inp1 = new Scanner(System.in);
        Scanner inp2 = new Scanner(System.in);
        System.out.println("Enter First String: ");
        String str1 = inp1.nextLine();
        System.out.println("Enter Second String: ");
        String str2 = inp2.nextLine();
        System.out.println(convertable(str1, str2));
    }

    public static String removeWhiteSpace(String str) {
        return str.replaceAll("\\s", "");
    }

    public static boolean convertable(String str1, String str2) {
        char[] s1 = stringToChar(removeWhiteSpace(str1.toLowerCase()));
        char[] s2 = stringToChar(removeWhiteSpace(str2.toLowerCase()));
        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1, s2);

    }

    public static char[] stringToChar(String str) {
        char[] ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        return ch;
    }

}