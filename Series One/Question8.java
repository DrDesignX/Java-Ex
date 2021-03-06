class Question8 {
    public static int LCM(int n1, int n2) {
        int lcm;
        lcm = (n1 > n2) ? n1 : n2;
        while (true) {
            if (lcm % n1 == 0 && lcm % n2 == 0) {
                // System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
                break;
            }
            ++lcm;
        }
        return lcm;
    }

    public static void printNumbers(int n) {
        if(n == 0){
            System.out.println("Error : Input must be greater than 0");
        }
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (LCM(i, j) != (i * j) && j > i) {
                    System.out.println("(" + i + "," + j + ")");
                }
            }
        }
    }

    public static void main(String[] args) {
        printNumbers(10);
    }
}
