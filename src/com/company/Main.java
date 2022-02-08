package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cow pastures1cow1 = new Cow("Dotie",7,750);
        Cow pastures1cow2 = new Cow("Belle",11,895);
        Cow pastures1cow3 = new Cow("Buttercup",8,800);
        Cow pastures1cow4 = new Cow("Magic",2,350);
        Cow pastures1cow5 = new Cow("Nellie",5,830);

        Sheep pastures1sheep1 = new Sheep("Sprinkles",10,100);
        Sheep pastures1sheep2 = new Sheep("Snow",3,100);
        Sheep pastures1sheep3 = new Sheep("Flower",5,90);
        Sheep pastures1sheep4 = new Sheep("Penelope",8,120);
        Sheep pastures1sheep5 = new Sheep("BlackJack",2,80);
        Sheep pastures1sheep6 = new Sheep("Espresso",13,110);
        Sheep pastures1sheep7 = new Sheep("Thunder",3,95);
        Sheep pastures1sheep8 = new Sheep("Stormy",11,115);

        Horse pastures1horse1 = new Horse("Alex",5,320);
        Horse pastures1horse2 = new Horse("Lilly",4,300);


        Cow pastures2cow1 = new Cow("Bessie",4,850);
        Cow pastures2cow2 = new Cow("Sugar",12,1200);

        Sheep pastures2sheep1 = new Sheep("Spring",10,150);
        Sheep pastures2sheep2 = new Sheep("Winter",1,55);
        Sheep pastures2sheep3 = new Sheep("Summer",8,90);
        Sheep pastures2sheep4 = new Sheep("Autumn",14,100);

        Horse pastures2horse1 = new Horse("Fancy",7,420);
        Horse pastures2horse2 = new Horse("Lady",8,320);
        Horse pastures2horse3 = new Horse("Luna",11,450);
        Horse pastures2horse4 = new Horse("Tucker",5,400);
        Horse pastures2horse5 = new Horse("Cosmo",2,320);

        Cow [] cows = {pastures1cow1,pastures1cow2,pastures1cow3,pastures1cow4,pastures1cow5};
        Sheep [] sheep = {pastures1sheep1,pastures1sheep2,pastures1sheep3,pastures1sheep4,pastures1sheep5,pastures1sheep6,pastures1sheep7,pastures1sheep8};
        Horse [] horse = {pastures1horse1,pastures1horse2};

        Cow [] cows2 = {pastures2cow1,pastures2cow2};
        Sheep [] sheep2 = {pastures2sheep1,pastures2sheep2,pastures2sheep3,pastures2sheep4};
        Horse [] horse2 = {pastures2horse1,pastures2horse2,pastures2horse3,pastures2horse4,pastures2horse5};

        Pastures pastures1 = new Pastures ("\nPastures name is: 'Old World'","Address is: Old street 121","Name of Owners is: Benjamin",cows,sheep,horse);
        System.out.println(pastures1.getNameOfPastures());
        System.out.println(pastures1.getAddressOfPastures());
        System.out.println(pastures1.getNameOfOwner());

        System.out.println("\nBeautiful cows from pasture 'Old World'");
        for (Cow arrayCows : pastures1.getCows()) {
            System.out.println(arrayCows.getNameOfCow()+" , "+arrayCows.getAge()+" years old, "+arrayCows.getWeight()+" kg");
        }
        System.out.println("\nSweety sheeps from 'Old World'");
        for (Sheep arraySheep : sheep) {
            System.out.println(arraySheep.getNameOfSheep()+" , "+arraySheep.getAge()+" years old, "+arraySheep.getWeight()+" kg");
        }
        System.out.println("\nGraceful horse from 'Old World'");
        for (Horse arrayHorse : horse) {
            System.out.println(arrayHorse.getNameOfHorse()+" , "+arrayHorse.getAge()+" years old, "+arrayHorse.getWeight()+" kg");
        }
        System.out.println("\n***__________________***__________________***\n");
        Pastures pastures2 = new Pastures
                ("Pastures name is: 'Beautiful pastures'","Address is: Somewhere place street 86","Name of Owners is: Bernard",cows2,sheep2,horse2);

        System.out.println(pastures2.getNameOfPastures());
        System.out.println(pastures2.getAddressOfPastures());
        System.out.println(pastures2.getNameOfOwner());
        System.out.println("\nBeautiful cows from pasture 'Beautiful pastures'");
        for (Cow arrayCow2 : cows2) {
            System.out.println(arrayCow2.getNameOfCow()+" , "+arrayCow2.getAge()+" , "+arrayCow2.getWeight()+" kg");
        }
        System.out.println("\nSweety sheeps from 'Beautiful pastures'");

        for (Sheep arraySheep2 : sheep2) {
            System.out.println(arraySheep2.getNameOfSheep()+" , "+arraySheep2.getAge()+" , "+arraySheep2.getWeight()+" kg");
        }
        System.out.println("\nGraceful horse from 'Beautiful pastures'");
        for (Horse arrayHorse2 : horse) {
            System.out.println(arrayHorse2.getNameOfHorse()+" , "+arrayHorse2.getAge()+" , "+arrayHorse2.getWeight()+" kg");
        }
    }
}
