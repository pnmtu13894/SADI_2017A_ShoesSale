package vn.edu.rmit.sadi_2017a_shoessale;

import java.net.URI;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Shoes extends Product {
    private static int nextShoesID = 0;
    private int shoesID;
    private Map<Integer, Integer> sizeByQuantity;

    Shoes(String name, String description, float price, String brand, Date releaseDate, HashSet<URI> imageFileName, Map<Integer, Integer> sizeByQuantity) {
        super(name, description, price, brand, releaseDate, imageFileName);
        this.sizeByQuantity = sizeByQuantity;
        this.shoesID = nextShoesID++;
    }

    public static int getNextShoesID() {
        return nextShoesID;
    }

    public void displayShoes() {
//        TODO: to implement
    }

    public void getProductDetails() {
//        TODO: to implement
    }

    public int getShoesID() {
        return shoesID;
    }

    public Map<Integer, Integer> getSizeByQuantity() {
        return sizeByQuantity;
    }

    public void setSizeByQuantity(Map<Integer, Integer> sizeByQuantity) {
        this.sizeByQuantity = sizeByQuantity;
    }
}
