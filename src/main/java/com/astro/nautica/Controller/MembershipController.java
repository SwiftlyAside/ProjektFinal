package com.astro.nautica.Controller;

import com.astro.nautica.Service.IMembershipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("member")
public class MembershipController {

    private final IMembershipService iMembershipService;

    @Autowired
    public MembershipController(IMembershipService iMembershipService) {
        this.iMembershipService = iMembershipService;
    }


    @GetMapping("/bookmarkInfo")
    public Map<String, String> bookmarkLst() {
        Map<String, String> bookmarkCnt = new HashMap<>();
        bookmarkCnt.put("productId", "001");
        bookmarkCnt.put("productName", "마티스");
        bookmarkCnt.put("productPrice", "1000");
        return bookmarkCnt;
    }

    @RequestMapping("/isExist")
    public int isExist(@RequestParam("id") String id) {
       return iMembershipService.isExistId(id);
    }

    @RequestMapping("/login")
    public boolean login(@RequestParam("id") String id, @RequestParam("pw") String pw) {
       return iMembershipService.login(id,pw);
    }

}
