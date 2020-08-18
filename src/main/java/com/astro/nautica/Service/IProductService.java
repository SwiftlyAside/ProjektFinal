package com.astro.nautica.Service;

import com.astro.nautica.VO.CategoryDetailsVO;
import com.astro.nautica.VO.CategoryVO;
import com.astro.nautica.VO.ProductVO;

import java.util.List;

public interface IProductService {
    /**
     * 상품 전체를 리스트로 반환.
     *
     * @return 상품 리스트
     */
    List<ProductVO> getProducts();

    /**
     * 해당 상품의 pid로 상품 정보 입수.
     *
     * @param pid 해당 상품의 pid
     * @return 해당 상품
     */
    ProductVO getProduct(String pid);

    /**
     * 대분류 항목을 리스트로 반환.
     *
     * @return 대분류 리스트
     */
    List<CategoryVO> getCategories();

    /**
     * 해당 제품명의 존재 여부를 반환.
     *
     * @param productName 제품명
     * @return 존재 여부
     */
    Boolean isExistProduct(String productName);

    /**
     * 해당 카테고리 ID의 소분류 목록을 리스트로 반환.
     *
     * @param categoryId 카테고리 ID
     * @return 소분류 리스트
     */
    List<CategoryDetailsVO> getCategoryDetails(String categoryId);

    /**
     * 상품을 등록하고 성공여부를 반환.
     *
     * @param productVO 등록할 상품
     * @return 성공여부
     */
    Boolean addProduct(ProductVO productVO);

    /**
     * 상품 정보를 수정하고 성공여부를 반환.
     *
     * @param productVO 정보를 수정할 상품
     * @return 성공여부
     */
    Boolean modifyProduct(ProductVO productVO);
}
