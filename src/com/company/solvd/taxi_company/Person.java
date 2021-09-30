package com.company.solvd.taxi_company;

public abstract class Person implements Info {

    private String name;
    private int age;
    private String work;



    @Override
    public void showInfo() {
        System.out.println("My name: "+name);
        System.out.println("I am "+age);
        System.out.println("My work is "+work);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public void eat() {
        System.out.println("I am eating");
    }
    public void sleep (){
        System.out.println("I am sleeping");
    }

}
