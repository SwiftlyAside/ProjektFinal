package com.astro.nautica.Service;

import com.astro.nautica.VO.CategoryVO;
import com.astro.nautica.VO.ProductVO;

import java.util.List;

public interface IProductService {
    /**
     * 상품 전체를 리스트로 반환.
     *
     * @return 상품 리스트
     */
    List<ProductVO> selectTest();

    /**
     * 대분류 항목을 리스트로 반환.
     *
     * @return 대분류 리스트
     */
    List<CategoryVO> getCategories();
}
