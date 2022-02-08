package com.company;

public class Horse {
    private String nameOfHorse;
    private int age;
    private int weight;

    public Horse(String nameOfHorse, int age, int weight) {
        this.nameOfHorse = nameOfHorse;
        this.age = age;
        this.weight = weight;
    }

    public String getNameOfHorse() {
        return nameOfHorse;
    }

    public void setNameOfHorse(String nameOfHorse) {
        this.nameOfHorse = nameOfHorse;
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
