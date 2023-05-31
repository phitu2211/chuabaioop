package chuabaikiemtra.b3;

import java.io.*;
import java.util.Arrays;

public class Computer implements Serializable {
    public String code;
    public String name;
    public String brand;
    public String config;
    public double price;
    public boolean status;

    public Computer[] computers;
    public int count;

    public Computer(String code, String name, String brand, String config, double price, boolean status) {
        this.code = code;
        this.name = name;
        this.brand = brand;
        this.config = config;
        this.price = price;
        this.status = status;
        this.computers = new Computer[100];
        this.count = 0;
    }

    public Computer() {
        this.computers = new Computer[100];
        this.count = 0;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", config='" + config + '\'' +
                ", price=" + price +
                ", status=" + status +
                '}';
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    public void addComputerToArray(Computer computer) {
        if(count > 100) {
            Computer[] newComputers = new Computer[count * 2];
//            for (int i = 0; i < count; i++){
//                newComputers[i] = this.computers[i];
//            }
            newComputers = Arrays.copyOf(newComputers, count);
            this.computers = newComputers;
        }

        this.computers[count++] = computer;
    }

    public void addComputerToFile(Computer computer, String fileName) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(computer);

        objectOutputStream.close();
        fileOutputStream.close();
    }

    public Computer getDataFromFile(String fileName) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(fileName);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Computer computer = (Computer) objectInputStream.readObject();

        objectInputStream.close();
        fileInputStream.close();

        return computer;
    }
    public void addComputersToFile(Computer[] computers, String fileName) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(computers);

        objectOutputStream.close();
        fileOutputStream.close();
    }

    public Computer[] getAllComputerFromFile(String fileName) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(fileName);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Computer[] computers = (Computer[]) objectInputStream.readObject();

        objectInputStream.close();
        fileInputStream.close();

        return computers;
    }


}
