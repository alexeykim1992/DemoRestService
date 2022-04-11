package com.example.demo.model;

public class Furniture {

    String name;
    int price;
    String material;

    public Furniture() {
    }

    public Furniture(String name, int price, String material) {
        this.name = name;
        this.price = price;
        this.material = material;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Table{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", material='" + material + '\'' +
                '}';
    }
}
