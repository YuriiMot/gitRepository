package com.company.solvd.taxi_company;

import com.company.solvd.taxi_company.enums.Profession;
import org.apache.log4j.Logger;

import java.util.Objects;

public abstract class Person implements IInform {

    protected static final Logger LOGGER = Logger.getLogger(Person.class);

    private String name;
    private int age;
    private String gender;
    private Profession profession;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name) &&
                Objects.equals(gender, person.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }

    @Override
    public String toString() {
        return "Person { " +
                "name = '" + name + '\'' +
                ", age = " + age + '\'' +
                '}';
    }

    @Override
    public void showInfo() {
        LOGGER.info("My name: " + getName());
        LOGGER.info("I am " + getAge());
        LOGGER.info("My work is " + getProfession());
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

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public String getProfession() {
        return profession.getProfession();
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public void eat() {
        LOGGER.info("I am eating");
    }

    public void sleep() {
        LOGGER.info("I am sleeping");
    }
}
