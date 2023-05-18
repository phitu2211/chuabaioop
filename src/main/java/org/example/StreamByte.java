package org.example;

import java.io.*;

public class StreamByte {
    public static void main(String[] args) {
        try {
            File f = new File("copyuseinputstream.png");
            f.createNewFile();
            f.setWritable(true);

            //B1: khởi tạo
            FileInputStream fis = new FileInputStream("demo.png");
            BufferedInputStream bis = new BufferedInputStream(fis);
            System.out.println("Gia tri dau tien: ");
            System.out.println(bis.read());

            FileOutputStream fos = new FileOutputStream(f);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            //B2: xử lý
            fos.write(fis.readAllBytes());

            //B3: đóng
            fis.close();
            fos.close();

        } catch (FileNotFoundException e) {
            System.out.println("K tìm thấy file");
        } catch (IOException e) {
            System.out.println("Loi io");
        }

    }
}