package com.company;

import java.util.Objects;

public class Bag {
    private String brand;
    private int size;
    private String color;

    public Bag(String brand, int size, String color){
        this.brand = brand;
        this.size = size;
        this.color = color;

    }

    public boolean equals (Object o) {
        if (o == null) return false; //x.equals(null) should return false
        if (this == o) return true; //reflexive property of equals function
        //symmetric and transitive properties of equals()
        if (o instanceof Bag) {
            Bag other = (Bag) o;
            return this.brand.equals(other.brand) &&
                    this.color.equals(other.color) &&
                    this.size == other.size;
        } else {
            return false;
        }

    }

    public int hashCode (){
        return Objects.hash(brand, size, color);
    }

}
