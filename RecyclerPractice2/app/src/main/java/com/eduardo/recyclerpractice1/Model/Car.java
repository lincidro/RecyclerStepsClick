package com.eduardo.recyclerpractice1.Model;

public class Car {
    String brand;
    int cc;
    int doors;

    public Car(){}

    public Car(String brand, int cc, int doors) {
        this.brand = brand;
        this.cc = cc;
        this.doors = doors;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}
