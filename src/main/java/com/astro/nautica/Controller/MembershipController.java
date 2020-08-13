package com.astro.nautica.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.astro.nautica.Service.IMembershipService;
import com.astro.nautica.VO.ProductVO;

@SessionAttributes("userInfo")
@RestController
@RequestMapping("member")
public class MembershipController {
	
	private final IMembershipService membershipService;
	
	@ModelAttribute("userInfo")
	public Map<String, Object> getUserInfo(){
		return new HashMap<String, Object>();
	}
	
	@Autowired
	public MembershipController(IMembershipService membershipService) {
		this.membershipService = membershipService;
	}
	
	@RequestMapping("bookmarkInfo")
	public List<ProductVO> bookmarkInfo(@ModelAttribute("userInfo") Map<String, Object> usrInfo){
		return membershipService.BookmarkList(usrInfo);
	}
}
