import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Question04 {
    public static void main(String[] args) throws IOException {
        String[][] dataBase = readfile();

        System.out.println("\n");

        findMaxGoalFor(dataBase);

        findMinGoalFor(dataBase);

        findBestGoalDifference(dataBase);

        findWorstGoalDifference(dataBase);

        findMaxGoalAgainst(dataBase);

        findMinGoalAgainst(dataBase);

        findMaxDraw(dataBase);

        findMinDraw(dataBase);
        
    }

    public static String[][] readfile() throws IOException {
        // read file and sort in 2D array
        FileReader fileReader = new FileReader("C:\\Users\\mr-se\\OneDrive\\Documents\\GitHub\\Java-Ex\\Series Four\\laliga-2019.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        String[][] data = new String[20][11];
        int i = 0;
        // skip first line
        bufferedReader.readLine();
        while ((line = bufferedReader.readLine()) != null) {
            String[] lineData = line.split("\t");
            for (int j = 0; j < 11; j++) {
                data[i][j] = lineData[j];
                // System.out.println(data[i][j]);
            }
            i++;
        }
        bufferedReader.close();
        fileReader.close();
        return data;
    }
    // find the team with the highest Goal For in Column 7
    public static void findMaxGoalFor(String[][] data) {
        int max = 0;
        String team = "";
        for (int i = 0; i < data.length; i++) {
            if (Integer.parseInt(data[i][7]) > max) {
                max = Integer.parseInt(data[i][7]);
                team = data[i][2];
            }
        }

        System.out.println("The \""+ team +"\" with the highest Goal For is " + max);
    }
    // find Which team has scored the least goal?
    public static void findMinGoalFor(String[][] data) {
        int min = 100;
        String team = "";
        for (int i = 0; i < data.length; i++) {
            if (Integer.parseInt(data[i][8]) < min) {
                min = Integer.parseInt(data[i][8]);
                team = data[i][2];
            }
        }
        System.out.println("The \""+ team +"\" with the least Goal For is " + min);
    }
    // find Which team has the best goal difference?
    public static void findBestGoalDifference(String[][] data) {
        int max = -100;
        String team = "";
        for (int i = 0; i < data.length; i++) {
            if (Integer.parseInt(data[i][7]) - Integer.parseInt(data[i][8]) > max) {
                max = Integer.parseInt(data[i][7]) - Integer.parseInt(data[i][8]);
                team = data[i][2];
            }
        }
        System.out.println("The \""+ team +"\" with the best Goal Difference is " + max);
    }
    // find Which team has the worst goal difference?
    public static void findWorstGoalDifference(String[][] data) {
        int min = 100;
        String team = "";
        // min in column 9
        for (int i = 0; i < data.length; i++) {
            if (Integer.parseInt(data[i][9])  < min) {
                min = Integer.parseInt(data[i][9]);
                team = data[i][2];
            }
        }
        System.out.println("The \""+ team +"\" with the worst Goal Difference is " + min);
    }
    // find Which team has highest Goal Against ?
    public static void findMaxGoalAgainst(String[][] data) {
        int max = 0;
        String team = "";
        for (int i = 0; i < data.length; i++) {
            if (Integer.parseInt(data[i][8]) > max) {
                max = Integer.parseInt(data[i][8]);
                team = data[i][2];
            }
        }
        System.out.println("The \""+ team +"\" with the highest Goal Against is " + max);
    }
    // find Which team has the least Goal Against ?
    public static void findMinGoalAgainst(String[][] data) {
        int min = 100;
        String team = "";
        for (int i = 0; i < data.length; i++) {
            if (Integer.parseInt(data[i][8]) < min) {
                min = Integer.parseInt(data[i][8]);
                team = data[i][2];
            }
        }
        System.out.println("The \""+ team +"\" with the least Goal Against is " + min);
    }
    // find Which team has the Most Draw?
    public static void findMaxDraw(String[][] data) {
        int max = 0;
        String team = "";
        for (int i = 0; i < data.length; i++) {
            if (Integer.parseInt(data[i][5]) > max) {
                max = Integer.parseInt(data[i][5]);
                team = data[i][2];
            }
        }
        System.out.println("The \""+ team +"\" with the most Draw is " + max);
    }
    // find Which team has the least Draw?
    public static void findMinDraw(String[][] data) {
        int min = 100;
        String team = "";
        for (int i = 0; i < data.length; i++) {
            if (Integer.parseInt(data[i][5]) < min) {
                min = Integer.parseInt(data[i][5]);
                team = data[i][2];
            }
        }
        System.out.println("The \""+ team +"\" with the least Draw is " + min);
    }
}

	// Pos	Team 		PM 	W	D	L	GF	GA	GD 	Pts
	// 1	Real Madrid	38	26	9	3	70	25	+45	87
	// 2	Barcelona	38	25	7	6	86	38	+48	82
	// 3	Atletiadrid	38	18	16	40	51	27	+24	70
	// 4	Sevilla		38	19	13	6	54	34	+20	70
	// 5	Villarreal	38	18	6	14	63	49	+14	60
	// 6	Real Sedad	38	16	8	14	56	48	+8	56
	// 7	Granada		38	16	8	14	52	45	+7	56
	// 8	Getafe		38	14	12	12	43	37	+6	54
	// 9	Valencia	38	14	11	13	46	53	-7	53
	// 10	Osasuna		38	13	13	12	46	54	-8	52
	// 11	Athletilbao	38	13	12	13	41	38	+3	51
	// 12	Levante		38	14	7	17	47	53	-6	49
	// 13	Real Vdolid	38	9	15	14	32	43	-11	42
	// 14	Eibar		38	11	9	18	39	56	-17	42
	// 15	Real Betis	38	10	11	17	48	60	-12	41
	// 16	Alaves		38	10	9	19	34	59	-25	39
	// 17	Celta de go	38	7	16	15	37	49	-12	37
	// 18	Leganes		38	8	12	18	30	51	-21	36
	// 19	Real Mallo	38	9	6	23	40	65	-25	33
	// 20	Espanyol	38	5	10	23	27	58	-31	25