package com.company;

public class Sheep {
    private String nameOfSheep;
    private int age;
    private int weight;

    public Sheep(String nameOfSheep, int age, int weight) {
        this.nameOfSheep = nameOfSheep;
        this.age = age;
        this.weight = weight;
    }

    public String getNameOfSheep() {
        return nameOfSheep;
    }

    public void setNameOfSheep(String nameOfSheep) {
        this.nameOfSheep = nameOfSheep;
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
