package rectangle;

//Rectangle
//- width: double
//- height: double
//- getArea -> input: ko co, output: double, tinh dt
//- getPerimeter -> input: ko co, output: double, tinh chu vi
//- display -> input: k, output: k, hien thi thong tin
public class Rectangle {
    private double width;
    private double height;
    public Rectangle() {
        this.height = 5;
        this.width = 4;
    }

    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public void display() {
        System.out.println("Chieu dai: " + this.width + "Chieu rong: " + this.height);
    }
}
