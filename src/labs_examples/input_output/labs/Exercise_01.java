package labs_examples.input_output.labs;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */

class Example {
    public static void main(String[] args) {
        FileOutputStream outputStream = null;
        BufferedInputStream bis= null;

        String filePath = "C:/Users/rpsha/Projects/online-java-fundamentals/src/labs_examples/input_output/files/input.txt";
        String fileOutputPath = "C:/Users/rpsha/Projects/online-java-fundamentals/src/labs_examples/input_output/files/output.txt";

        try {

            bis= new BufferedInputStream(new FileInputStream(filePath));
            outputStream = new FileOutputStream(fileOutputPath);

            // this will hold the collection of bytes that we read at once
            byte[] buffer = new byte[5];
            int bytesRead = 0;

            while ((bytesRead = bis.read(buffer)) != -1){
                // print out bytes read to console
                System.out.print(new String(buffer, 0, bytesRead));
                for (int i = 0; i < bytesRead; i++) {
                    outputStream.write(buffer[i]);
                }
            }
        } catch (IOException exc) {
            exc.printStackTrace();
        } finally {
            try {
                bis.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
                        try {
                outputStream.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
    }



    }
