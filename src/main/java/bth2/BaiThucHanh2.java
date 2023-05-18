package bth2;

import java.io.*;

public class BaiThucHanh2 {
    // Phân tích đầy đủ 4 yếu tố của phương thức trên.
    //yto1: writeData
    //yto2: input: string data, string filename
    //yto3: output: boolean
    //yto4: ghi du lieu vao file theo cac tham số (input) truyền vào

    public boolean writeData(String data, String fileName) throws IOException {
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            bos.write(data.getBytes());

            bos.close();
            fos.close();
            return true;
        } catch (FileNotFoundException e) {
            throw e;
        } catch (IOException e) {
            throw e;
        }
    }

    // Phân tích đầy đủ 4 yếu tố của phương thức trên.
    //yto1: readData
    //yto2: input: String filename
    //yto3: output: String
    //yto4: trả ve du lieu tu file doc duoc theo tham so truyen vao

    public String readData(String fileName) throws IOException {
        String result = "";
        FileInputStream fis = new FileInputStream(fileName);
        BufferedInputStream bis = new BufferedInputStream(fis);

        //C1
        int c = bis.read();
        while (c != -1) {
            result += (char) c;
            c = bis.read();
        }
        //C2
//        byte[] dataFromFile = bis.readAllBytes();
//        result = new String(dataFromFile);
//
//        bis.close();
//        fis.close();

        return result;
    }

}
