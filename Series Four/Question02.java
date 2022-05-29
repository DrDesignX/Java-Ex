import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// Internet Address      	Physical Address      
//   192.168.2.1          		 00-22-2d-8e-6c-a2     
//   192.168.2.255        	ff-ff-ff-ff-ff-ff     
//   224.0.0.22            		01-00-5e-00-00-16     
//   224.0.0.251         		 01-00-5e-00-00-fb     
//   224.0.0.252         		 01-00-5e-00-00-fc     
//   239.255.255.250    	 01-00-5e-7f-ff-fa     
//   255.255.255.255       	ff-ff-ff-ff-ff-ff     
//   192.168.2.72	        	8C-70-5A-21-96-40
//   192.168.2.2	        	d0-fc-cc-7d-8c-e5
//   source: IPMAC.txt

public class Question02 {
    public static void main(String[] args) {
        System.out.println(readFile());
    }

    public boolean starts(String s) {
        return s.startsWith(s);
    }

    public static String[][] findMac(String[][] array) {
        String[][] array2 = new String[9][];
        String mac = "01-00-5e-00-00-fc";
        // substring 0 to 8 mac
        System.out.println("MAC: " + mac);
        mac = mac.substring(0, 8);
        for (int i = 0; i < 9; i++) {
            if (mac.equals(array[1][i].substring(0, 8))) {
                System.out.println(array[0][i] + "\t > Same > " + array[1][i]);
                array[0][i] = array[1][i];
            }
        }
        return array2;
    }

    // method to read file line by line
    public static String[][] readFile() {
        String[][] array = new String[2][];
        array[0] = new String[100];
        array[1] = new String[100];
        int i = 0;
        // and remove all spaces
        try {
            File file = new File("C:\\Users\\mr-se\\OneDrive\\Documents\\GitHub\\Java-Ex\\Series Four\\IPMAC.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            // skip the first line
            bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                // trim line
                line = line.trim();
                // split line
                String[] ipmac = line.split("\\s+");
                // set ip and mac in array
                array[0][i] = ipmac[0];
                array[1][i] = ipmac[1];
                i++;
                // System.out.println(ipmac[0] + " >> " + ipmac[1]);
            }
            bufferedReader.close();

            String[] ip = new String[9];
            String[] mac = new String[9];

            int a = 0;
            int b = 0;

            for (int c = 0; a < 9; c++) {
                ip[a++] = array[0][c];
                mac[b++] = array[1][c];
            }

            for (String s : ip) {
                if (s.startsWith("192.168")) {
                    System.out.println("ip >> " + s);
                }
            }

            for (int z = 0; z < 9; z++) {
                for (int q = z + 1; q < 9; q++) {
                    if (mac[z] == mac[q]) {
                        System.out.println(ip[z] + "\t has the same mac as " + ip[q]);
                    } else {
                        // System.out.println(ip[z] + "\t doesn't sahre the same mac as " + ip[q]);
                    }
                }
            }

            for (int z = 0; z < 9; z++) {
                for (int q = z + 1; q < 9; q++) {
                    if (mac[z] == mac[q]) {
                        System.out.println(ip[z] + "\t has the same mac as " + ip[q]);
                    } else {
                        // System.out.println(ip[z] + "\t doesn't share the same mac as " + ip[q]);
                    }
                }
            }
            System.out.println(findMac(array));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return array;
    }
}