package chuabaikiemtra.b2;

import java.io.*;

public class TestIOText {
    public static void main(String[] args) {
        String[] arraySong = {
                "Hello califonia",
                "We don’t talk any more",
                "Nắng ấm xa dần",
                "Em của ngày hôm qua",
                "Thất tình"
        };
        String fileName = "list_song.txt";
        try {
//            writeDataToFileWithFileWriter(fileName, arraySong);
//            String dataFromFile = readDataToFileWithFileReader(fileName);
//            System.out.println(dataFromFile);

            writeDataToFileWithBufferWrite(fileName, arraySong);
            String readWithBuffer = readDataToFileWithBufferReader(fileName);
            System.out.println(readWithBuffer);

        } catch (IOException e) {
            System.out.println("Loi");
        }
    }

    public static void writeDataToFileWithFileWriter(String fileName, String[] data) throws IOException {
        FileWriter fileWriter = new FileWriter(fileName);
//        for (int i = 0; i < data.length; i++) {
//            fileWriter.write(data[i]);
//        }
        for (String song : data) {
            fileWriter.write(song);
        }
        fileWriter.close();
    }

    public static String readDataToFileWithFileReader(String fileName) throws IOException {
        FileReader fileReader = new FileReader(fileName);

        int characterBytes = fileReader.read();
        String dataReadFromFile = "";
        // hello
        while (characterBytes != -1) {
//            System.out.println((char) characterBytes); // h
            dataReadFromFile += (char) characterBytes; //"hello"
            dataReadFromFile += "\n";
            characterBytes = fileReader.read();
        }

        return dataReadFromFile;
    }

    public static void writeDataToFileWithBufferWrite(String fileName, String[] data) throws IOException {
        FileWriter fileWriter = new FileWriter(fileName);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//        for (int i = 0; i < data.length; i++) {
//            fileWriter.write(data[i]);
//        }
        for (String song : data) {
            bufferedWriter.write(song);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
        fileWriter.close();
    }

    public static String readDataToFileWithBufferReader(String fileName) throws IOException {
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String song = bufferedReader.readLine();
        String dataReadFromFile = "";

        while (song != null) {
            dataReadFromFile += song;
            dataReadFromFile += "\n";
            song = bufferedReader.readLine();
        }

        fileReader.close();
        bufferedReader.close();

        return dataReadFromFile;
    }
}
