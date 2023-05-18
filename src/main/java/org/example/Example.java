package org.example;

import java.io.*;

public class Example {
    public static void main(String[] args) {
        try {
            //B1: tạo đối tượng (mở sách)
            FileReader fr = new FileReader("demo.txt");
            //B2: xử lý dữ liệu (doc sách)
            int c = 0;
            while ((c = fr.read()) != -1){
                System.out.println((char) c);
            }
            //B3: đóng sách
            fr.close();

            //B1: tạo đối tượng (mở vở)
            FileWriter fw = new FileWriter("demo.txt");
            //B2: ghi (viết)
            fw.write("Hoc OOP");
            //B3: đóng
            fw.close();
        } catch (FileNotFoundException e) {
            System.out.println("K tìm thấy file");
        } catch (IOException e) {
            System.out.println("Loi io");
        }
    }
}