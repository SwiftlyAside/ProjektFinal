package com.astro.nautica.VO;

public class ProductOptionVO {
    // 옵션 식별자
    private int optionId;

    // 제품 식별자
    private String pid;

    // 옵션 명
    private String optionName;

    // 옵션 추가가격
    private String optionAddPrice;

    public int getOptionId() {
        return optionId;
    }

    public void setOptionId(int optionId) {
        this.optionId = optionId;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    public String getOptionAddPrice() {
        return optionAddPrice;
    }

    public void setOptionAddPrice(String optionAddPrice) {
        this.optionAddPrice = optionAddPrice;
    }
}