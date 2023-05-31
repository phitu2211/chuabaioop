package chuabaikiemtra.b1;

public class People {
    private int age;

    public People(int age) {
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public People(){}

    @Override
    public String toString() {
        return "People{" +
                "age=" + age +
                '}';
    }
}
