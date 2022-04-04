import java.util.Scanner;

class Question06 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = inp.nextLine();
        newString(s);
    }

    public static void newString(String str) {
        char[] array = str.toCharArray();
        char[] newarr = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            newarr[(i + 7) % str.length()] = array[i];
        }

        String result = "";
        for (char c : newarr) {
            result += c;
        }

        System.out.println(result);
    }

}