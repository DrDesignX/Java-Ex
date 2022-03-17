class Question9 {
    public static String baseConverter(String num, int fromBase, int toBase) {
        return Integer.toString(Integer.parseInt(num, fromBase), toBase);
    }

    public static int sumofDigits(int num) {
        int digit, sum = 0;
        while (num > 0) {
            digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        return sum;
    }

    public static void XOR(int arr[], int num) {
        int size = arr.length;
        int newArr[] = new int[size];
        String numString = Integer.toString(num);
        String numConverted = baseConverter(numString, 10, 2);
        int numBinary = Integer.parseInt(numConverted);
        int j = 0;
        int x = 0;

        for (int i = 0; i < size; i++) {
            String digit = Integer.toString(arr[i]);
            String converted = baseConverter(digit, 10, 2);
            int parsed = Integer.parseInt(converted);
            x = numBinary ^ parsed;
            String xString = Integer.toString(x);
            String convBin = baseConverter(xString, 2, 10);
            int xBinary = Integer.parseInt(convBin);
            newArr[j++] = xBinary;
        }

        for (int i = 0; i < size; i++) {
            System.out.println(newArr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = { 2, 4, 1, 3, 5 };
        XOR(arr, 6); 
    }
}
