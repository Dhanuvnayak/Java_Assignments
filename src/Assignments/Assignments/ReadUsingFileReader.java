package Assignments;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadUsingFileReader {
    public static void main(String args[]) {

        try {
            // Creates a FileReader
            //file path passed as parameter to the FileReader constructor.
            FileReader fr = new FileReader("bw.txt");
            // Creates a BufferedReader
            BufferedReader br = new BufferedReader(fr);

            int i;
            // If the read() method returns -1, there is no more data to read in the FileReader
            while ((i = br.read()) != -1) {
                //reads all characters one char at a time from the FileReader.
                System.out.print((char) i);
            }
            //closing FileWriter and BufferedWriter
            br.close();
            fr.close();
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

}
