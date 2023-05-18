package org.example;

import java.io.*;

public class StreamCharacter {
    public static void main(String[] args) {
        try {
            File f = new File("copyusefw.png");
            f.createNewFile();
            f.setWritable(true);

            FileReader fr = new FileReader("demo.png");
            FileWriter fw = new FileWriter(f);

            int c = 0;
            while ((c = fr.read()) != - 1){
                fw.write(c);
            }

            fr.close();
            fw.close();
        } catch (FileNotFoundException e) {
            System.out.println("K tìm thấy file");
        } catch (IOException e) {
            System.out.println("Loi io");
        }
    }
}