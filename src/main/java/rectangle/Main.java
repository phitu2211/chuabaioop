package rectangle;

public class Main {
    public static void main(String[] args) {
//        double width = 3.4;
//        double height = 7.6;
////        Rectangle hcn = new Rectangle(width, height);
//        Rectangle hcn = new Rectangle();
//
//        hcn.display();
//
//        double area = hcn.getArea();
//        System.out.println("dien tich: " + area);
//
//        double perimeter = hcn.getPerimeter();
//        System.out.println("chu vi: " + perimeter);




        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        System.out.println(fan1.toString());

        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        System.out.println(fan2.toString());






    }
}
