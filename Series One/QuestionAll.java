class Main {

    // 1st question ****************************************
    public static String printDegree(int a, int degree) {
        String theDegree = "";
        if (degree == 0) {
            theDegree = a + "";
        } else {
            theDegree = a + "x^" + degree;
        }

        if (a == 0) {
            return "";
        }
        return theDegree;
    }

    public static void addPolymonial(int a[], int b[]) {
        int aSize = a.length;
        int bSize = b.length;
        String finalOutput = "";

        if (aSize > 4 || bSize > 4) {
            System.out.println("invalid size");
        } else {
            if (aSize == bSize) {
                for (int i = 0; i < aSize; i++) {
                    int deg = 3 - i;
                    int sum = a[i] + b[i];
                    if (i != aSize - 1 && sum != 0) {
                        finalOutput += printDegree(sum, deg) + "  +  ";
                    }
                    if (i == aSize - 1) {
                        finalOutput += printDegree(sum, deg);
                    }
                }
            }

            if (aSize != bSize) {
                int bigger = aSize > bSize ? aSize : bSize;
                int smaller = aSize > bSize ? bSize : aSize;
                int startIndex = bigger - (bigger - smaller);

                for (int i = 0; i < smaller; i++) {
                    int deg = 3 - i;
                    int sum = a[i] + b[i];
                    if (sum != 0) {
                        finalOutput += printDegree(sum, deg) + "  +  ";
                    }
                }

                int biggerArr[] = bigger == aSize ? a : b;

                for (int i = startIndex; i < bigger; i++) {
                    int deg = 3 - i;
                    int summation = biggerArr[i];
                    if (i != bigger - 1 && summation != 0) {
                        finalOutput += printDegree(summation, deg) + "  +  ";
                    }
                    if (i == bigger - 1 && summation != 0) {
                        finalOutput += printDegree(summation, deg);
                    }
                }
            }

            System.out.println(finalOutput);
        }

    }

    // 2nd question ****************************************
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

    // 3rd question ****************************************
    public static void printDiamonds(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {
                if (k == 1 || k == (i * 2) - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {
                if (k == 1 || k == (i * 2) - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println(" ");

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 4th question ****************************************
    public static void getGrades(int grades[]) {
        int size = grades.length;
        int i = 0;
        float sum = 0;
        int highestGeade = 0;
        int lowestGrade = 100;
        while (i < size) {
            sum += grades[i];
            if (grades[i] > highestGeade) {
                highestGeade = grades[i];
            }
            if (grades[i] < lowestGrade) {
                lowestGrade = grades[i];
            }

            i++;
        }

        System.out.println("average : " + sum / size);
        System.out.println("highest grade : " + highestGeade);
        System.out.println("lowest grade : " + lowestGrade);
    }

    // 5th question ****************************************
    // also 10th question
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

            String converted = baseConverter(num, fromBase, toBase);
            int inted = Integer.parseInt(converted);
            System.out.println(sumofDigits(inted));
        }
    }

    // 6th question ****************************************
    public static void moveArr(int arr[], int num) {
        int size = arr.length;
        int newArr[] = new int[size];
        int j = 0;
        int numRepeatition = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] == num) {
                numRepeatition += 1;
            }
        }

        for (int i = 0; i < size; i++) {
            if (arr[i] != num) {
                newArr[j++] = arr[i];
            }
        }

        for (int i = j; i < size; i++) {
            newArr[i] = num;
        }

        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }

    }

    // 7th question ****************************************
    public static void findNumbers(int arr[]) {
        int biggestPositive = 0;
        int smallestNegetive = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                biggestPositive = arr[i];
                if (arr[i] > biggestPositive) {
                    biggestPositive = arr[i];
                }
            }

            if (arr[i] < 0) {
                smallestNegetive = arr[i];
                if (arr[i] > smallestNegetive) {
                    smallestNegetive = arr[i];
                }
            }
        }

        System.out.println(biggestPositive + smallestNegetive);

    }

    // 8th question ****************************************
    public static int LCM(int Fnum, int Snum) {
        int lcm;
        lcm = (Fnum > Snum) ? Fnum : Snum;
        while (true) {
            if ((lcm % Fnum == 0) && (lcm % Snum == 0)) {
                System.out.printf("The LCM of %d and %d is %d.", Fnum, Snum, lcm);
                return lcm;
                // break;
            }
            ++lcm;
        }
    }

    public static void numGenANDcheck(int num) {
        int[] arr = new int[num];
        for (int i = 1; i < num; i++) {
            arr[i] = i;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int k = i + 1; k < arr.length; k++) {
                if (arr[i] < arr[k]) {
                    if (arr[i] * arr[k] == LCM(arr[i], arr[k]))
                        System.out.print("(" + arr[i] + "," + arr[k] + ") | ");
                } else {
                }
            }
        }
    }

    // 9th question ****************************************
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

        // 1st question example ********************
        // int a[] = { 3, 0, 0, 7 };
        // int b[] = { 0, 0 , 1 , 0};
        // addPolymonial(a, b);

        // 2nd question example ********************
        // printShapes(9);

        // 3rd question example ********************
        // printDiamonds(7);

        // 4th question example ********************
        // int grades[] = { 19, 20, 14, 15, 20 , 6 };
        // getGrades(grades);

        // 5th & 10th question example ********************
        // baseConverter("766", 10, 9);
        // sumOfConvert("766", 10, 9);

        // 6th qestion example ********************
        // int arr[] = { 1, 2, 3, 4, 2, 3, 2, 5 };
        // moveArr(arr, 3);

        // 7th qestion example ********************
        // int arr[] = { 2, 3, 7, 12, -4 , -2 };
        // findNumbers(arr);

        // 9th qestion example ********************
        // int arr[] = { 2, 4, 1, 3, 5 };
        // XOR(arr, 5);

    }
}
