package labs_examples.input_output.labs;

import java.io.*;
import java.util.ArrayList;

class Exercise_04 {
    public static void main(String[] args) {
        ArrayList<Member> members = new ArrayList<>();
        String filePath = "C:/Users/rpsha/courses/codingNomadsJava/src/labs_examples/input_output/files/exercise04Input.csv";
        String outputPath = "C:/Users/rpsha/courses/codingNomadsJava/src/labs_examples/input_output/files/exercise04Output.csv";

        // Reading and parsing CSV
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine(); // Skipping header line
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length == 3) {
                    try {
                        members.add(mapValuesToMemberObject(values));
                    } catch (NumberFormatException e) {
                        System.err.println("Invalid age in line: " + line);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Print all members
        for (Member mem : members) {
            System.out.println(mem.toString());
        }

        // Writing members to new CSV
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputPath))) {
            bw.write("firstName,LastName,age"); // Optional: write header
            bw.newLine();
            for (Member mem : members) {
                bw.write(mem.getFirstName() + "," + mem.getLastName() + "," + mem.getAge());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Member mapValuesToMemberObject(String[] values) {
        Member member = new Member();
        member.setFirstName(values[0]);
        member.setLastName(values[1]);
        member.setAge(Integer.parseInt(values[2]));
        return member;
    }
}
