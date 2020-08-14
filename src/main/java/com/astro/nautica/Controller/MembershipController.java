package com.astro.nautica.Controller;

import com.astro.nautica.Service.IMembershipService;
import com.astro.nautica.VO.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("member")
@SessionAttributes("userInfo")
public class MembershipController {

    private final IMembershipService iMembershipService;

    @Autowired
    public MembershipController(IMembershipService iMembershipService) {
        this.iMembershipService = iMembershipService;
    }

    @ModelAttribute("userInfo")
    public Map<String, Object> getSessionInfo() {
        return new HashMap<>();
    }
  
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

    @RequestMapping("/isExist")
    public int isExist(@RequestParam("id") String id) {
       return iMembershipService.isExistId(id);
    }

    @RequestMapping("/login")
    public boolean login(@RequestParam("id") String id, @RequestParam("pw") String pw, @ModelAttribute("userInfo") Map<String, Object> userInfo)  {
       return iMembershipService.login(id, pw, userInfo);
    }

    @RequestMapping("/findId")
    public String findId(@RequestParam("email") String email) {
        return iMembershipService.findId(email);
    }

    @RequestMapping("/changePw")
    public boolean changePw(@RequestParam("data") String data, @RequestParam("pw") String pw, @RequestParam("pwOk") String pwOk) {
        return iMembershipService.changePw(data, pw, pwOk);
    }

    @RequestMapping("/makeMember")
    public String makeMember(MemberVO memberVO) {
        if (this.isExist(memberVO.getId()) != 1 /*pw 체크 생략*/) {
            iMembershipService.makeMember(memberVO);
            return "회원가입 성공";
        }
        return "회원가입 실패";
    }
}
