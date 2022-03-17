class Question2 {
    public static void printShapes(int x) {
        String star = "*";

        // 1st shape
        for (int i = 1; i <= x; i++) {
            String repeated = star.repeat(i);
            System.out.println(repeated);
        }
        System.out.println(" ");

        // 2nd shape
        for (int i = x; i >= 1; i--) {
            String repeated = star.repeat(i);
            System.out.println(repeated);

        }
        System.out.println(" ");

        // 3rd shape
        for (int i = x; i >= 1; i--) {
            if (i == x) {
                String repeated = star.repeat(i);
                System.out.println(repeated);
            }
            if (1 < i && i < x) {
                String repeated = " ".repeat(i - 2);
                System.out.println(star + repeated + star);
            }
            if (i == 1) {
                System.out.println(star);
            }

        }
        System.out.println(" ");

        // 4th shappe
        for (int i = 1; i <= x; i++) {
            for (int j = x; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println(" ");

        // 5th Shape
        for (int i = x; i >= 1; i--) {
            for (int j = i; j <= x; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println(" ");

        // 6th shape
        for (int i = 1; i <= x; i++) {
            for (int j = x; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    if (i == x) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        printShapes(9);
    }
}
