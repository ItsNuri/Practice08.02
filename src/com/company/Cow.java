package com.company;

public class Cow {
    private String nameOfCow;
    private int age;
    private int weight;

    public Cow(String nameOfCow, int age, int weight) {
        this.nameOfCow = nameOfCow;
        this.age = age;
        this.weight = weight;
    }

    public String getNameOfCow() {
        return nameOfCow;
    }

    public void setNameOfCow(String nameOfCow) {
        this.nameOfCow = nameOfCow;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
