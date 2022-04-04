import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Question01 {
    // email = "emailtest@gmail.ir";
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Please enter your email: ");
        String email = inp.nextLine();
        System.out.println(isValid(email));
    }

    public static char[] StringToChar(String str) {
        char[] ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        return ch;
    }

    public static boolean isValid(String email) {
        char[] emailChars =  StringToChar(email);
        if (emailChars[0] == '_') {
            return false;
        }
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "a-z]{2,3}$";
        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }
}
