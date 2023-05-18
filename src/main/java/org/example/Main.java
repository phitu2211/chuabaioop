package org.example;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream("students.dat",true);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new AppendableObjectOutputStream(bos);

        Student s = new Student(1,"tri",19,"12a1");
        Student s1 = new Student(2,"anh",19,"12a1");
        Student s2 = new Student(3,"minh",19,"12a1");
        Student s3 = new Student(4,"hung",19,"12a1");
        Student s4 = new Student(5,"vinh",19,"12a1");

        oos.writeObject(s);
        oos.writeObject(s1);
        oos.writeObject(s2);
        oos.writeObject(s3);
        oos.writeObject(s4);
        oos.close();
        bos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("students.dat");
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new AppendableObjectInputStream(bis);

        Student student = (Student) ois.readObject();
        while (student != null){
            System.out.println(student.toString());
            student = (Student) ois.readObject();
        }
    }
}