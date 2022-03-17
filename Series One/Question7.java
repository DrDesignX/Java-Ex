class Question7 {
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
    public static void main(String[] args) {
        int arr[] = { 2, 3, 7, 12, -4 , -2 };
        findNumbers(arr); 
    }
}
