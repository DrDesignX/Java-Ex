import java.util.Scanner;

class Question14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String ja = input.next();
        subString(ja);
    }

    public static boolean startIsEnd(String str) {
        char[] s = str.toCharArray();
        if (str.length() == 1) {
            return true;
        }

        if (s[0] == s[s.length - 1]) {
            return true;
        }

        return false;

    }

    static void subString(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++)
            for (int j = i + 1; j <= str.length() - 1; j++) {
                // System.out.println(str.substring(i, j));
                count++;
            }
        System.out.print(count + " because  : ");
        for (int i = 0; i < str.length(); i++)
            for (int j = i + 1; j <= str.length(); j++) {
                if (startIsEnd(str.substring(i, j))) {
                    System.out.print(str.substring(i, j)  + " , ");
                }
            }
    }
}