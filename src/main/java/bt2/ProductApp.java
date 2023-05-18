package bt2;

import java.io.IOException;

public class ProductApp {
    public static void main(String[] args) {
        Product p1 = new Product("1", "iphone 10", 10000, "Apple");
        Product p2 = new Product("2", "iphone 11", 20000, "Apple");
        Product p3 = new Product("3", "iphone 12", 30000, "Apple");
        Product p4 = new Product("4", "iphone 13", 40000, "Apple");
        Product p5 = new Product("5", "iphone 14", 50000, "Apple");


        ProductProcess pp = new ProductProcess();
        String fileName = "product.dat";
        try {
            pp.writeProduct(p1, fileName);
            pp.writeProduct(p2, fileName);
            pp.writeProduct(p3, fileName);
            pp.writeProduct(p4, fileName);
            pp.writeProduct(p5, fileName);

            Product[] products = pp.readProduct(fileName);

            for (Product product : products) {
                System.out.println(product);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Xu ly k tim thay class");
        } catch (IOException e) {
            System.out.println("Xy ly ngoai le");
        }
    }
}
