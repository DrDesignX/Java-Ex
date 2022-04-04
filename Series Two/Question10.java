import java.util.Scanner;

class Question10 {
    public static void main(String[] args) {
        Scanner inp1 = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = inp1.nextInt();
        Scanner inp2 = new Scanner(System.in);
        System.out.print("Enter the power: ");
        int power = inp2.nextInt();
        System.out.println("The result is: " + power(base, power));
    }

    public static int power(int x, int n) {
        if (n != 0) {
            return (x * power(x, n - 1));
        } else {
            return 1;
        }
    }
}