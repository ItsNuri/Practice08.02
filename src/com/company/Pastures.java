package com.company;

public class Pastures {
    private String nameOfPastures;
    private String addressOfPastures;
    private String nameOfOwner;
    private Cow [] cows;
    private Sheep [] sheep;
    private Horse [] horse;

    public Pastures(String nameOfPastures, String addressOfPastures, String nameOfOwner, Cow[] cows, Sheep[] sheep, Horse[] horse) {
        this.nameOfPastures = nameOfPastures;
        this.addressOfPastures = addressOfPastures;
        this.nameOfOwner = nameOfOwner;
        this.cows = cows;
        this.sheep = sheep;
        this.horse = horse;
    }

    public String getNameOfPastures() {
        return nameOfPastures;
    }

    public void setNameOfPastures(String nameOfPastures) {
        this.nameOfPastures = nameOfPastures;
    }

    public String getAddressOfPastures() {
        return addressOfPastures;
    }

    public void setAddressOfPastures(String addressOfPastures) {
        this.addressOfPastures = addressOfPastures;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public void setNameOfOwner(String nameOfOwner) {
        this.nameOfOwner = nameOfOwner;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Sheep[] getSheep() {
        return sheep;
    }

    public void setSheep(Sheep[] sheep) {
        this.sheep = sheep;
    }

    public Horse[] getHorse() {
        return horse;
    }

    public void setHorse(Horse[] horse) {
        this.horse = horse;
    }
}
