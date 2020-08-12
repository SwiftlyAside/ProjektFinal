package com.astro.nautica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class CommandController {
    private final IProductService productService;

    @Autowired
    public CommandController(IProductService productService) {
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

}
