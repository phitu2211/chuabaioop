package bt2;

import java.io.Serializable;

public class Product implements Serializable {
    //mã, tên sản phẩm, giá, hãng sản xuất)
    String code;
    String name;
    double price;
    String brand;

    public Product(String code, String name, double price, String brand) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }
}
