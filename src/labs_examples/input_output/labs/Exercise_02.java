package labs_examples.input_output.labs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

/**
 * Input/Output Exercise 2: File encryption
 *
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 *
 *      Then, read back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 *
 */


 class Exercise_02 {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        BufferedReader br2 = null;
        String fileInputPath = "C:/Users/rpsha/Projects/online-java-fundamentals/src/labs_examples/input_output/files/input.txt";
        String fileOutputPath = "C:/Users/rpsha/Projects/online-java-fundamentals/src/labs_examples/input_output/files/output.txt";
        try{
            br = new BufferedReader(new FileReader(fileInputPath));
            bw = new BufferedWriter(new FileWriter(fileOutputPath));
            br2 = new BufferedReader(new FileReader(fileOutputPath));
            int readChar;
            while ((readChar = br.read()) != -1) {
                char ch = (char) readChar;
                System.out.print(ch);
                if (ch == 'a') {
                    ch = '-';
                } 
                if (ch == 'e') {
                    ch = '~';
                }
                bw.write(ch);
            }
            br.close();
            bw.close();
            System.out.println();
            System.out.println("Now we are going to read the encrypted file and decrypt it!");
            
            int readCh;
            while ((readCh = br2.read()) != -1) {
                char ch2 = (char) readCh;
                if (ch2 == '-') {
                    ch2 = 'a';
                }
                if (ch2 == '~') {
                    ch2 = 'e';
                }
                System.out.print(ch2);

            }
        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        } finally {
            try {
                br2.close();
            } catch (IOException exc) {
                System.out.println(exc.getMessage());
            }
        }


        
    }
 }