package rectangle;

public class Fan {
    public final static int SLOW = 1;
    public final static int MEDIUM = 2;
    public final static int FAST = 3;

    private int speed;

    public int getSpeed(){
        return this.speed;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    private boolean on;

    public boolean getOn(){
        return this.on;
    }

    public void setOn(boolean on){
        this.on = on;
    }

    private double radius;

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    private String color;

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public Fan(){
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    //input: k co
    //output: int
    //trả về thông tin quạt
    public String toString(){
        String info = "Speed: "
                + this.speed +
                " Color: " +
                this.color + " Radius: " + this.radius;
        if(this.on) {
            info += "fan is on";
        }else {
            info += "fan is off";
        }

        return info;
    }
}
