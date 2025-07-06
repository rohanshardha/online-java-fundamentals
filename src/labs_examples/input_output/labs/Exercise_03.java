package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 3: 
 *
 *     1) Demonstrate the use of the DataOutputStream and DataInputStream
 *
 */
public class Exercise_03 {

    public static void main(String[] args) {
        // File path where data will be written and read from
        String filePath = "C:/Users/rpsha/Projects/online-java-fundamentals/src/labs_examples/input_output/files/exercise_03.dat";

        // 1. Write primitive data types using DataOutputStream
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {
            dos.writeInt(12345);         // int
            dos.writeFloat(67.89f);      // float
            dos.writeLong(987654321L);   // long
            dos.writeBoolean(true);      // boolean
            System.out.println("Data written to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 2. Read primitive data types using DataInputStream
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {
            int intValue = dis.readInt();
            float floatValue = dis.readFloat();
            long longValue = dis.readLong();
            boolean boolValue = dis.readBoolean();
            System.out.println("int: " + intValue);
            System.out.println("float: " + floatValue);
            System.out.println("long: " + longValue);
            System.out.println("boolean: " + boolValue);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
