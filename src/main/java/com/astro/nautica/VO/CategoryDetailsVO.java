package com.astro.nautica.VO;

public class CategoryDetailsVO {
    // 상세정보 식별자 generated as identity
    private int detailId;

    // 카테고리 식별자
    private int categoryId;

    // 상세정보 분류
    private String detail;

    public int getDetailId() {
        return detailId;
    }

    public void setDetailId(int detailId) {
        this.detailId = detailId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

}
