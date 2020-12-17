package edu4;

public class Product {
    private double regularPrice;
    
    public Product(double regularPrice) {
        this.regularPrice = regularPrice;
    }
   
    // Method that will be overridden
    public double computeSalePrice(){
        return 0;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }
}
