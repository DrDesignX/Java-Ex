import java.util.Scanner;

class Question03 {
    /* 
        Github  : https://github.com/DrDesignX/Java-Ex
    */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Please Enter a String: ");
        String string = inp.nextLine();
        removeDuplications(string);
    }

    public static void removeDuplications(String string) {
        char[] array = stringToChar(string);

        String str = "";
        for (int i = 0; i < array.length; i++) {
            if (str.indexOf(array[i]) == -1)
                str = str + array[i];
        }
        System.out.println(str);
    }

    public static char[] stringToChar(String str) {
        char[] ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        return ch;
    }

}