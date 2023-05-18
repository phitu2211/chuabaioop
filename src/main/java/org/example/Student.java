package org.example;

import java.io.Serializable;

public class Student implements Serializable {
    public int code;
    public String name;
    public int age;
    public String lophoc;
    public Student(){}
    public Student(int code,String name,int age,String lophoc){
        this.code=code;
        this.name=name;
        this.age=age;
        this.lophoc=lophoc;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getLophoc() {
        return lophoc;
    }

    public void setLophoc(String lophoc) {
        this.lophoc = lophoc;
    }
    @Override
    public String toString(){
        return "Name: "
                +getName()
                +", lop: "
                +getLophoc()
                +", age: "
                +getAge()
                +", code: "
                +getCode();
    }
}









