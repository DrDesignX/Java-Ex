import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Question01 {

    public static void main(String[] args) throws IOException {
        
        // call function DeCode()
        DeCode();
        System.out.println("\n-------------------------\n");
        // call function EnCode()
        EnCode();

    }

    public static void DeCode() throws IOException {
        char[] str = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q','r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        char[] str2 = new char[] { 'D', 'K', 'V', 'Q', 'F', 'I', 'B', 'J', 'W', 'P', 'E', 'S', 'C', 'X', 'H', 'T', 'M','Y', 'A', 'U', 'O', 'L', 'R', 'G', 'Z', 'N' };
        // File file = new File(input.txt);
        FileReader fr = new FileReader("input.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        while (line != null) {
            // toLowercase
            line = line.toLowerCase();
            // split line
            String[] words = line.split("\\s+");
            // loop through words
            for (int i = 0; i < words.length; i++) {
                // loop through each character
                for (int j = 0; j < words[i].length(); j++) {
                    // loop through str
                    for (int k = 0; k < str.length; k++) {
                        // if character is equal to str
                        if (words[i].charAt(j) == str[k]) {
                            // replace with str2
                            words[i] = words[i].replace(words[i].charAt(j), str2[k]);
                        }
                    }
                }
            }
            // print words
            for (int i = 0; i < words.length; i++) {
                System.out.print(words[i] + " ");
            }
            System.out.println();
            line = br.readLine();
        }
        br.close();
    }
    
    public static void EnCode() throws IOException {
        char[] str = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q','r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        char[] str2 = new char[] { 'D', 'K', 'V', 'Q', 'F', 'I', 'B', 'J', 'W', 'P', 'E', 'S', 'C', 'X', 'H', 'T', 'M','Y', 'A', 'U', 'O', 'L', 'R', 'G', 'Z', 'N' };
        FileReader fr = new FileReader("input2.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        while (line != null) {
            // toUppercase
            line = line.toUpperCase();
            // split line
            String[] words = line.split("\\s+");
            // loop through words
            for (int i = 0; i < words.length; i++) {
                // loop through each character
                for (int j = 0; j < words[i].length(); j++) {
                    // loop through str
                    for (int k = 0; k < str.length; k++) {
                        // if character is equal to str
                        if (words[i].charAt(j) == str2[k]) {
                            // replace with str
                            words[i] = words[i].replace(words[i].charAt(j), str[k]);
                        }
                    }
                }
            }
            // print words
            for (int i = 0; i < words.length; i++) {
                System.out.print(words[i] + " ");
            }
            System.out.println();
            line = br.readLine();
        }
        br.close();
    }
}