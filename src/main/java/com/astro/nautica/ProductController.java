package com.astro.nautica;

import com.astro.nautica.Service.IProductService;
import com.astro.nautica.VO.CategoryVO;
import com.astro.nautica.VO.ProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("product")
public class ProductController {
    private final IProductService productService;

    @Autowired
    public ProductController(IProductService productService) {
        this.productService = productService;
    }


    @RequestMapping("/mantoman")
    public Map<String, Object> man() {
        Map<String, Object> map = new HashMap<>();
        map.put("tag", "<h1>hellou man!</h1>");
        map.put("name", "man");
        map.put("array", new ArrayList<>(Arrays.asList("man", "man2", "man3")));
        return map;
    }

    @RequestMapping("/onlyArray")
    public List<String> onlyArray() {
        return new ArrayList<>(Arrays.asList("bean", "coffee", "brew"));
    }
    
    @GetMapping("/user/bookmarkInfo")
    public Map<String, String> bookmarkLst(){
    	Map<String, String> bookmarkCnt = new HashMap<String, String>();
    	bookmarkCnt.put("productId", "001");
    	bookmarkCnt.put("productName", "마티스");
    	bookmarkCnt.put("productPrice", "1000");
    	return bookmarkCnt;
    }


    @RequestMapping("/selectTest")
    public List<ProductVO> selectTest() {
        return productService.selectTest();
    }

    @RequestMapping("/getCategories")
    public List<CategoryVO> getCategories() {
        return productService.getCategories();
    }
}
