// URL = https://github.com/DrDesignX/Java-Ex
class Question1 {
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
                        finalOutput += printDegree(sum, deg) + " + ";
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
                        finalOutput += printDegree(sum, deg) + " + ";
                    }
                }

                int biggerArr[] = bigger == aSize ? a : b;

                for (int i = startIndex; i < bigger; i++) {
                    int deg = 3 - i;
                    int summation = biggerArr[i];
                    if (i != bigger - 1 && summation != 0) {
                        finalOutput += printDegree(summation, deg) + " + ";
                    }
                    if (i == bigger - 1 && summation != 0) {
                        finalOutput += printDegree(summation, deg);
                    }
                }
            }

            System.out.println(finalOutput);
        }

    }
    public static void main(String[] args) {
        int a[] = { 1, -1, 5, 7 };
        int b[] = { 0, 3 , 6 , -2};
        addPolymonial(a, b);
    }
}
