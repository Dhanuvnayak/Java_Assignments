package Assignments;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteUsingOutputStream {
    public static void main(String args[]) {

        String data = "This text is written using OutputStream.";

        try {

            OutputStream fos = new FileOutputStream("os.txt");

            // Converts the string into bytes
            byte[] db = data.getBytes();

            // Writes data to the output stream
            fos.write(db);
            System.out.println("Data is written to the file.");

            // Closes the output stream
            fos.close();
        } catch (Exception e) {

            e.getStackTrace();
        }
    }

}
