package com.astro.nautica.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("member")
public class MembershipController {
	private Map<String, String> bookmarkMap;
	private Map<String, String> cartMap;
    @GetMapping("/bookmarkInfo")
    public List<Map<String, String>> bookmarkLst() {
    	List<Map<String, String>> lst = new ArrayList<Map<String,String>>();
        bookmarkMap = new HashMap<>();
        bookmarkMap.put("productId", "001");
        bookmarkMap.put("productName", "마티스");
        bookmarkMap.put("productPrice", "1000");
        lst.add(bookmarkMap);
        return lst;
    }

    @GetMapping("/cartInfo")
    public List<Map<String, String>> shoppingCartLst() {
    	List<Map<String, String>> lst = new ArrayList<Map<String,String>>();
        cartMap = new HashMap<>();
        cartMap.put("productId", "001");
        cartMap.put("productName", "마티스");
        cartMap.put("productPrice", "1000");
        lst.add(cartMap);
        cartMap = new HashMap<>();
        cartMap.put("productId", "002");
        cartMap.put("productName", "마티스2");
        cartMap.put("productPrice", "2000");
        lst.add(cartMap);
        return lst;
    }
}
