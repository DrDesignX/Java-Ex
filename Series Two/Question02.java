import java.util.Scanner;
class Question02 {
    /* 
        Github  : https://github.com/DrDesignX/Java-Ex
        Authors : MohamadAmin Seydi & MohamadReza Barkhordari 
    */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Please enter First String :");
        String first = inp.nextLine();
        System.out.println("Please enter First String :");
        String second = inp.nextLine();
        System.out.println(stringComparison(first, second));
        // System.out.println(stringsEqual(first, second));
        // System.out.println(containsNumber(second));
        // System.out.println(lengthGreaterThanEight(first));
        // System.out.println(containsSpecialChar(first));
    }

    public static boolean stringsEqual(String first, String second) {
        return first.equals(second);
    }

    public static boolean containsNumber(String string) {
        int digitCount = 0;
        char[] stringChars = string.toCharArray();
        for (char ch : stringChars) {
            if (Character.isDigit(ch)) {
                digitCount++;
            }
        }
        if (digitCount > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean lengthGreaterThanEight(String string) {
        return string.length() > 8;
    }

    public static boolean containsSpecialChar(String string) {
        int count = 0;

        String s = string;
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i)) && !Character.isWhitespace(s.charAt(i))) {
                count++;
            }
        }
        if (count == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean stringComparison(String first, String second) {
        return stringsEqual(first, second) &&  containsNumber(first) && lengthGreaterThanEight(first) && containsSpecialChar(first);
    }

}
