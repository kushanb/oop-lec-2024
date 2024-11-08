package com.iit.oop.week6;

import java.io.*;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader in = new BufferedReader(new FileReader("./src/com/iit/oop/week6/list.txt"));
            BufferedWriter out = new BufferedWriter(new FileWriter("src/com/iit/oop/week6/list_copy.txt", true));
            String content = in.readLine();
            System.out.println(content);

            String line = in.readLine();
            while (line != null) {
                out.write(line);
                out.newLine();
                line = in.readLine();
            }
            in.close();
            out.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
