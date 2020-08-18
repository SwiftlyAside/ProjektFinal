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

    @RequestMapping("/getProducts")
    public List<ProductVO> getProducts() {
        return productService.getProducts();
    }

    @RequestMapping("/getProduct")
    public ProductVO getProduct(@RequestParam("pid") String pid) {
        return productService.getProduct(pid);
    }

    @RequestMapping("/getCategories")
    public List<CategoryVO> getCategories() {
        return productService.getCategories();
    }

    @RequestMapping("/isExistProduct")
    public Boolean isExistProduct(@RequestParam(value = "productName", defaultValue = "nay") String productName) {
        return productService.isExistProduct(productName);
    }

    @RequestMapping("/getCategoryDetails")
    public List<CategoryDetailsVO> getCategoryDetails(@RequestParam(value = "categoryId", defaultValue = "nay") String categoryId) {
        return productService.getCategoryDetails(categoryId);
    }

    @RequestMapping("/addProduct")
    public Boolean addProduct(ProductVO productVO) {
        return productService.addProduct(productVO);
    }

    @RequestMapping("/modifyProduct")
    public Boolean modifyProduct(ProductVO productVO) {
        return productService.modifyProduct(productVO);
    }

    @RequestMapping("/deleteProduct")
    public Boolean deleteProduct(@RequestParam("pid") String pid) {
        return productService.deleteProduct(pid);
    }

    @GetMapping("/bookmarkInfo")

    public List<ProductVO> bookmarkLst() {
        return null;
    }
}
