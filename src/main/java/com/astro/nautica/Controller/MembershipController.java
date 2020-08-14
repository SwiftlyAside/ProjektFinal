package com.astro.nautica.Controller;

import com.astro.nautica.Service.IMembershipService;
import com.astro.nautica.VO.MemberVO;
import com.astro.nautica.VO.ProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SessionAttributes("userInfo")
@RestController
@RequestMapping("member")
public class MembershipController {

    private final IMembershipService membershipService;

    @Autowired
    public MembershipController(IMembershipService membershipService) {
        this.membershipService = membershipService;
    }

    @ModelAttribute("userInfo")
    public Map<String, Object> getUserInfo() {
        return new HashMap<String, Object>();
    }

    @RequestMapping("bookmarkInfo")
    public List<ProductVO> bookmarkInfo(@ModelAttribute("userInfo") Map<String, Object> usrInfo) {
        return membershipService.BookmarkList(usrInfo);
    }

    @ModelAttribute("userInfo")
    public Map<String, Object> getSessionInfo() {
        return new HashMap<>();
    }

    @GetMapping("/bookmarkInfo")
    public List<Map<String, String>> bookmarkLst() {
        List<Map<String, String>> lst = new ArrayList<>();
        Map<String, String> bookmarkMap = new HashMap<>();
        bookmarkMap.put("productId", "001");
        bookmarkMap.put("productName", "마티스");
        bookmarkMap.put("productPrice", "1000");
        lst.add(bookmarkMap);
        return lst;
    }

    @RequestMapping("/isExist")
    public int isExist(@RequestParam("id") String id) {
        return membershipService.isExistId(id);
    }

    @RequestMapping("/login")
    public boolean login(@RequestParam("id") String id, @RequestParam("pw") String pw, @ModelAttribute("userInfo") Map<String, Object> userInfo) {
        return membershipService.login(id, pw, userInfo);
    }

    @RequestMapping("/findId")
    public String findId(@RequestParam("email") String email) {
        return membershipService.findId(email);
    }

    @RequestMapping("/changePw")
    public boolean changePw(@RequestParam("data") String data, @RequestParam("pw") String pw, @RequestParam("pwOk") String pwOk) {
        return membershipService.changePw(data, pw, pwOk);
    }

    @RequestMapping("/makeMember")
    public String makeMember(MemberVO memberVO) {
        if (this.isExist(memberVO.getId()) != 1 /*pw 체크 생략*/) {
            membershipService.makeMember(memberVO);
            return "회원가입 성공";
        }
        return "회원가입 실패";
    }
}
