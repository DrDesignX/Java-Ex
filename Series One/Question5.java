class Question5 {
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

    public static void sumOfConvert(String num, int fromBase, int toBase) {
        if (toBase > 10) {
            System.out.println("toBase should be below 10");
        } else {

            // sum of digits
            // stringity the num
            int numNum = Integer.parseInt(num);
            int summ = sumofDigits(numNum);
            String strSumm = Integer.toString(summ);
            String converted = baseConverter(strSumm, fromBase, toBase);
            System.out.println(converted);
        }
    }
    public static void main(String[] args) {
        sumOfConvert("467", 10, 4);
    }
}
