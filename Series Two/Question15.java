import java.util.Scanner;

class Question15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter a number: ");
            Scanner inp = new Scanner(System.in);
            arr[i] = inp.nextInt();
        }
        for (int s : addArray(arr)) {
            System.out.println(s);
        }
    }

    public static int[] addArray(int[] arr) {
        int len = arr.length;
        if (len == 1) {
            return arr;
        }
        int newlen = len - 1;
        int[] newarr = new int[newlen];
        int j = 0;
        for (int i = 0; i < len - 1; i++) {
            newarr[j++] = arr[i] + arr[i + 1];
        }
        return addArray(newarr);
    }
}