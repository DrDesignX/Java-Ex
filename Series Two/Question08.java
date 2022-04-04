import java.util.Scanner;

class Question08 {
    public static void main(String[] args) {
        do {
            System.out.println("\n1. Encode");
            System.out.println("2. Decode");
            System.out.println("0. Exit");
            System.out.print(">>> ");
            Scanner menuItem = new Scanner(System.in);
            int choice = menuItem.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter String: ");
                    Scanner inp1 = new Scanner(System.in);
                    String str1 = inp1.nextLine();
                    StrUnCode(str1);
                    System.out.println("\n--------------");
                    break;
                case 2:
                    System.out.println("Enter String: ");
                    Scanner inp2 = new Scanner(System.in);
                    String str2 = inp2.nextLine();
                    StrDeCode(str2);
                    System.out.println("\n--------------");
                    break;
                case 0:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        } while (true);
    }

    public static void StrUnCode(String str) {
        char[] CharStr = str.toCharArray();
        for (int i = 0; i < CharStr.length; i++) {
            System.out.print((char) (CharStr[i] + 3));
        }
    }

    public static void StrDeCode(String str) {
        char[] CharStr = str.toCharArray();
        for (char x : CharStr) {
            System.out.print((char) (x - 3));
        }
    }
}