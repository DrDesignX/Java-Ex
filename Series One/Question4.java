class Question4 {
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

    public static void main(String[] args) {
        int grades[] = { 19, 20, 14, 15, 20, 6 };
        getGrades(grades);
    }
}
