import java.util.Scanner;

class Question09 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = inp.nextInt();
        int n = 1;
        RecNumb(number, 1);
    }

    public static int RecNumb(int number, int n) {
        if (number < n) {
            return 0;
        }
        System.out.println(n);
        n++;
        return RecNumb(number, n);
    }

}