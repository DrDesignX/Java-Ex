import java.util.Scanner;
import java.util.regex.Pattern;

class Question01 {
    /* 
        Github  : https://github.com/DrDesignX/Java-Ex
        Authors : MohamadAmin Seydi & MohamadReza Barkhordari 
    */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Please enter your email: ");
        String email = inp.nextLine();
        System.out.println(isValid(email));
    }

    public static boolean isValid(String email) {
        char[] emailChars =  email.toCharArray();
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
