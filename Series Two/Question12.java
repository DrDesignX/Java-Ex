import java.util.Scanner;

class Question12 {
    public static void main(String[] args) {
        Scanner inp1 = new Scanner(System.in);
        System.out.println("Enter the fisrt number: ");
        int first = inp1.nextInt();
        Scanner inp2 = new Scanner(System.in);
        System.out.println("Enter the second number: ");
        int second = inp2.nextInt();
        System.out.println("The result is: " + ReGCD(first, second));
    }
    public static int ReGCD(int first, int second) {
        if (first == 0) {
            return second;
        }
        if (second == 0) {
            return first;
        }
        if (first == second) {
            return first;
        }
        if (first > second) {
            return ReGCD(first - second, second);
        }
        return ReGCD(first, second - first);

    }
}