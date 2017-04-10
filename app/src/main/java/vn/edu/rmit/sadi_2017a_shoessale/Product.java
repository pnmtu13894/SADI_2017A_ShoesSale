package vn.edu.rmit.sadi_2017a_shoessale;

import java.net.URI;
import java.util.Date;
import java.util.HashSet;


abstract class Product {
    private String name;
    private String description;
    private float price;
    private String brand;
    private Date releaseDate;
    //    TODO: discuss với TÚ về việc sẽ có đến mấy cái hình ứng với 1 product chư không phải 1 nên cần dùng Set // Ok anh
    private HashSet<URI> imageFileName;

    Product(String name, String description, float price, String brand, Date releaseDate, HashSet<URI> imageFileName) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.brand = brand;
        this.releaseDate = releaseDate;
        this.imageFileName = imageFileName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public HashSet<URI> getImageFileName() {
        return imageFileName;
    }

    public void setImageFileName(HashSet<URI> imageFileName) {
        this.imageFileName = imageFileName;
    }
}
