package bth2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BaiThucHanh2 bth2 = new BaiThucHanh2();

        try {
            String data = "Hoc OOP";
            String fileName = "data.dat";
            bth2.writeData(data, fileName);

            System.out.println(bth2.readData(fileName));
        } catch (IOException e) {
            System.out.println("Xu ly io");
        }
    }
}
