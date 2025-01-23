package Assignments;

import java.io.FileWriter;

public class WriteUsingFileWriter {
    public static void main(String[] args) {

        String s = "This text is written using FileWriter.";

        try {

            FileWriter fw = new FileWriter("fw.txt");

            //provides method to write string directly.
            fw.write(s);
            //closing FileWriter
            fw.close();
            System.out.println("Data is written to the file.");

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
