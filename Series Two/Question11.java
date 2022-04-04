import java.util.Scanner;

class Question11 {
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("The result is: " + isTwoWay(str, 0));
    }

    public static boolean isTwoWay(String str, int firstIndex) {
        // System.out.println(str);
        char[] arr = str.toCharArray();
        for (int i = firstIndex; i < arr.length; i++) {
            // System.out.println(arr[firstIndex] + "=>" + arr[arr.length - (firstIndex + 1)]);
            if (arr[firstIndex] == arr[arr.length - (firstIndex + 1)]) {
                if (firstIndex <= arr.length) {
                    isTwoWay(str, firstIndex + 1);
                    return true;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}