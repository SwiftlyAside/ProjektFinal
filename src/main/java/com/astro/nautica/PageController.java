package com.astro.nautica;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	private Map<String, String> pathMap;
	public PageController() {
		pathMap = new HashMap<String, String>();
		pathMap.put("man", "man");
		pathMap.put("login", "membership/loginForm");
		pathMap.put("findMember", "membership/findMemberForm");
		pathMap.put("changePass", "membership/changePassWordForm");
		pathMap.put("makeMember", "membership/makeMemberForm");
		pathMap.put("userHome", "userManagement/userHome");
		pathMap.put("modifyInfo", "userManagement/userModifyMemberForm");
		pathMap.put("orderInfo", "userManagement/userOrderForm");
	}
	//index
	@RequestMapping(value = "/")
	public String index() {
		return "redirect:/local/man";
	}
	//index-membership
	@RequestMapping(value = "/local/{path}")
	public String path(Model model, @PathVariable String path) {
		model.addAttribute("path", "form/" + path);
		return "index";
	}

	//userManagement
	@RequestMapping(value = "/user/{path}")
	public String userPath(Model model, @PathVariable String path) {
		System.out.println("userPage? : " + path);
		model.addAttribute("path", "form/" + path);
		return "userIndex";	//왜 이동을 못 하는 것이지?
	}
	
	@RequestMapping(value = "/form/{path}")
	public String formpath(@PathVariable String path) {
		System.out.println("form? : " + path);
		return pathMap.get(path);
	}
}
