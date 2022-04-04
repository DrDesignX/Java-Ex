import java.util.Scanner;

class Question05 {
    /*
     * Github : https://github.com/DrDesignX/Java-Ex
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = inp.nextLine();
        vowelCount(str);
        
        /*
         *  output     input
         *    0      fez or day
         *    1      day fyyyz
         *    0      Hi You
         *    1      bye aa tt you
         */
    }
    public static boolean containsVowel(String str) {
        return str.contains("a") || str.contains("e") || str.contains("i") || str.contains("o") || str.contains("u") || str.contains("A") || str.contains("E") || str.contains("I") || str.contains("O") || str.contains("U");
    }
    public static void vowelCount(String str) {
        int count = 0;
        String[] splited = str.split(" ");
        for (String c : splited) {
            if (!containsVowel(c)) {
                count++;
            }
        }
        System.out.println(count);
    }
}