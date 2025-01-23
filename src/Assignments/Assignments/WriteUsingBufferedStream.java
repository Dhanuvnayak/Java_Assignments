package Assignments;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class WriteUsingBufferedStream {
    public static void main(String[] args) {
        String s = "This text is written using BufferedOutputStream.";

        try {

            FileOutputStream fos = new FileOutputStream("bos.txt");

            BufferedOutputStream bos = new BufferedOutputStream(fos);

            byte[] arr = s.getBytes();
            // write() method writes data to the output stream
            bos.write(arr);
            //closing streams
            bos.close();
            fos.close();
            System.out.println("Data is written to the file.");

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
