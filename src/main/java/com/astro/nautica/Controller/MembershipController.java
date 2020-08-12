package com.astro.nautica.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("member")
public class MembershipController {

    @GetMapping("/bookmarkInfo")
    public Map<String, String> bookmarkLst() {
        Map<String, String> bookmarkCnt = new HashMap<>();
        bookmarkCnt.put("productId", "001");
        bookmarkCnt.put("productName", "마티스");
        bookmarkCnt.put("productPrice", "1000");
        return bookmarkCnt;
    }

}
