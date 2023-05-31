package chuabaikiemtra.b3;

import java.io.IOException;

public class AppComputer {
    public static void main(String[] args) {
        //VIM
        String fileName = "database.txt";

        Computer computer1 = new Computer();
        Computer computer2 = new Computer();

        Computer server = new Computer();
        Computer[] computers = new Computer[] {computer1, computer2};
        server.addComputerToArray(computer1);
        try {
            server.addComputerToFile(computer1, fileName);
            Computer computer = server.getDataFromFile(fileName);
            System.out.println(computer);

            server.addComputersToFile(computers, fileName);
            Computer[] listComputer = server.getAllComputerFromFile(fileName);

            for (Computer com : listComputer) {
                System.out.println(com);
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        }
    }
}
