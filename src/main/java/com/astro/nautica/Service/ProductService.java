package com.astro.nautica.Service;

import com.astro.nautica.Mapper.ProductMapper;
import com.astro.nautica.VO.CategoryDetailsVO;
import com.astro.nautica.VO.CategoryVO;
import com.astro.nautica.VO.ProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class ProductService implements IProductService {
    public final ProductMapper productMapper;

    @Autowired
    public ProductService(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    @Override
    public List<ProductVO> getProducts() {
        return productMapper.getProducts();
    }

    @Override
    public ProductVO getProduct(String pid) {
        return productMapper.getProduct(pid);
    }

    @Override
    public List<CategoryVO> getCategories() {
        return productMapper.getCategories();
    }

    @Override
    public Boolean isExistProduct(String productName) {
        return productMapper.isExistProduct(productName);
    }

    @Override
    public List<CategoryDetailsVO> getCategoryDetails(String categoryId) {
        return productMapper.getCategoryDetails(categoryId);
    }

    @Override
    public Boolean addProduct(ProductVO productVO) {
        try {
            productMapper.addProduct(productVO);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public Boolean modifyProduct(ProductVO productVO) {
        try {
            productMapper.modifyProduct(productVO);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
