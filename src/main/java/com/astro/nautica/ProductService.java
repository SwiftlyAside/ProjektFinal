package com.astro.nautica;

import com.astro.nautica.Mapper.ProductMapper;
import com.astro.nautica.VO.ProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    public final ProductMapper productMapper;

    @Autowired
    public ProductService(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    @Override
    public List<ProductVO> selectTest() {
        return productMapper.selectTest();
    }
}
