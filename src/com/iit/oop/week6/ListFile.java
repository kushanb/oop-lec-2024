package com.iit.oop.week6;

import java.io.*;

public class ListFile {
    public static void main(String[] args) throws FileNotFoundException {
        File currentDirectory = new File("./src/com/iit/oop/week6");

        String[] content = currentDirectory.list();

        try {

            for (String item : content) {
                if(new File(item).isFile()) {
                    continue;
                }
                System.out.println(item);
                try {
                    FileReader reader = new FileReader(new File(currentDirectory, item));
                    FileWriter writer = new FileWriter(
                            new File(currentDirectory, "list.txt"), true);
                    writer.write(item + "\n");
                    writer.close();

                } catch (FileNotFoundException e) {
                    System.out.println("Error: The file was not found");
                } catch (IOException e) {
                    System.out.println("Error while writing file");
                }
            }

            File inputFile = new File("src/com/iit/oop/week6/Text.txt");
            File outputFile = new File("src/com/iit/oop/week6/Text_copy.txt");

            FileInputStream in = new FileInputStream(inputFile);
            FileOutputStream out = new FileOutputStream(outputFile);

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
            in.close();
            out.close();

        } catch (NullPointerException e) {
            System.out.println("The path is wrong...");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
