import java.util.Scanner;

class Question04 {
    /*
     * Github : https://github.com/DrDesignX/Java-Ex
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = inp.nextLine();
        binaryPart(str);
        /*
         * binaryPart("whati101s11your0nam100e?") → 5
         * binaryPart ("I love java") → 0
         * binaryPart ("hello J10101110oe") → 174
         */
    }

    public static String baseConverter(String num, int fromBase, int toBase) {
        return Integer.toString(Integer.parseInt(num, fromBase), toBase);
    }

    public static int getMax(int[] arr) {
        int i;
        int max = arr[0];
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
        return max;
    }

    public static void binaryPart(String str) {
        char[] array = str.toCharArray();
        char[] newarr = new char[str.length()];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '0' || array[i] == '1') {
                newarr[j++] = array[i];
            } else {
                newarr[j++] = '-';
            }
        }
        String stringChar = "";
        for (char c : newarr) {
            stringChar += c;
        }
        int count = 0;
        String[] splited = stringChar.split("-");
        for (String s : splited) {
            if (s != "") {

                // System.out.println(baseConverter(s, 2, 10));
                count++;

                // nums[a++] = Integer.parseInt(baseConverter(s, 2, 10));
            }

        }
        if(count==0)
        {
            System.out.println("not found");
        }
        else
        {
            int[] nums = new int[count];
            int a = 0;
            for (String s : splited) {
                if (s != "") {
                    nums[a++] = Integer.parseInt(baseConverter(s, 2, 10));
                }
            }
            System.out.println(getMax(nums));
        }
    }
}