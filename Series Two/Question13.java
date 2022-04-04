import java.util.Scanner;

class Question13 {
    public static void main(String[] args) {
        try (Scanner inp1 = new Scanner(System.in)) {
            System.out.println("Enter fisrt number: ");
            int m = inp1.nextInt();
            Scanner inp2 = new Scanner(System.in);
            System.out.println("Enter second number: ");
            int n = inp2.nextInt();
            System.out.println("The result is: " + RecAckerman(m, n));
        }

    }
    public static int RecAckerman(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if ((m > 0) && (n == 0)) {
            return RecAckerman(m - 1, 1);
        } else if ((m > 0) && (n > 0)) {
            return RecAckerman(m - 1, RecAckerman(m, n - 1));
        } else
            return n + 1;
    }
}