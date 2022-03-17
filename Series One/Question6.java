class Question6 {
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
            System.out.print(newArr[i] + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 2, 3, 2, 5 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        moveArr(arr, 2);
    }
}
