package com.astro.nautica.VO;

public class CategoryVO {
    // 카테고리 식별자
    private int categoryId;

    // 카테고리 분류 unique
    private String categoryName;

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}