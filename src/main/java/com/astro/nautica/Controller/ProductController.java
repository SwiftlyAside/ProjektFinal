package com.astro.nautica.Controller;

import com.astro.nautica.Service.IProductService;
import com.astro.nautica.VO.CategoryDetailsVO;
import com.astro.nautica.VO.CategoryVO;
import com.astro.nautica.VO.ProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {
    private final IProductService productService;

    @Autowired
    public ProductController(IProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public ProductVO getProduct(@RequestParam("pid") String pid) {
        return productService.getProduct(pid);
    }

    @PostMapping("/")
    public Boolean addProduct(ProductVO productVO) {
        return productService.addProduct(productVO);
    }

    @PutMapping("/")
    public Boolean modifyProduct(ProductVO productVO) {
        return productService.modifyProduct(productVO);
    }

    @GetMapping("/all")
    public List<ProductVO> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/categories")
    public List<CategoryVO> getCategories() {
        return productService.getCategories();
    }

    @GetMapping("/isExistProduct")
    public Boolean isExistProduct(@RequestParam(value = "productName", defaultValue = "nay") String productName) {
        return productService.isExistProduct(productName);
    }

    @GetMapping("/category_details")
    public List<CategoryDetailsVO> getCategoryDetails(@RequestParam(value = "categoryId", defaultValue = "nay") String categoryId) {
        return productService.getCategoryDetails(categoryId);
    }

    @RequestMapping("/delete")
    public Boolean deleteProduct(@RequestParam("pid") String pid) {
        return productService.deleteProduct(pid);
    }
}
