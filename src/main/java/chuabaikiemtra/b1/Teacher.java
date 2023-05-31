package chuabaikiemtra.b1;

public class Teacher extends People {
    String subject;

    public Teacher(){
        super();
    }

    public Teacher(String subject, int age){
        super(age);// Lưu ý
        this.subject =subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "age" + this.getAge() +
                "subject='" + subject + '\'' +
                '}';
    }
}
