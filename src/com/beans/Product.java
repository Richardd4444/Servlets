package com.beans;

public class Product {
    private int productId;
    private String productName;
    private String productImgPath;

    public String getProductName() {
        return productName;
    }

    public String getProductImgPath() {
        return productImgPath;
    }

    public int getProductId(){
        return productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductImgPath(String productImgPath) {
        this.productImgPath = productImgPath;
    }

    public void setProductId(int productId){
        this.productId = productId;
    }

}
