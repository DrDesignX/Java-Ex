class Question10 {
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
    public static void main(String[] args) {
        System.out.println(baseConverter("766", 10, 9));
    }
}
