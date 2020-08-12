package com.astro.nautica.VO;

public class ProductVO {

    // 제품 식별자
    private String pid;

    // 카테고리 식별자
    private int categoryId;

    // 제품 이미지
    private String productImage;

    // 제품 이름
    private String productName;

    // 제품 개수
    private int ea;

    // 제품 가격
    private int price;

    // 제품 할인율
    private int saleRate;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getEa() {
        return ea;
    }

    public void setEa(int ea) {
        this.ea = ea;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSaleRate() {
        return saleRate;
    }

    public void setSaleRate(int saleRate) {
        this.saleRate = saleRate;
    }
}
