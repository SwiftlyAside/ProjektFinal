package com.astro.nautica.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.astro.nautica.Service.IUserInquireService;
import com.astro.nautica.VO.InquireVO;
import com.astro.nautica.VO.ProductVO;

//이 컨트롤러의 이름을 변경요청합니다 - MyPageController
@SessionAttributes("userInfo")
@RestController
@RequestMapping("myPage")
public class UserInquireController {

	private final IUserInquireService userinquireservice;
	
	@Autowired
	public UserInquireController(IUserInquireService userinquireservice) {
		this.userinquireservice = userinquireservice;
	}
	
	@ModelAttribute("userInfo")
	public Map<String, Object> userInfo(){
		return new HashMap<String, Object>();
	}
	
	@RequestMapping("orderProduct")
	public List<InquireVO> orderProduct(@ModelAttribute("userInfo") Map<String, Object> usrInfo){
		return userinquireservice.selectInquiresList(usrInfo);
	}
	
	@RequestMapping("getDetail")
	public InquireVO getDetail(@RequestParam("inquireId") int inquireId, 
				@ModelAttribute("userInfo") Map<String, Object> usrInfo) {
		return userinquireservice.getInquire(inquireId, usrInfo);
	}
	
	@RequestMapping("bookmarkInfo")
    public List<ProductVO> bookmarkInfo(@ModelAttribute("userInfo") Map<String, Object> usrInfo) {
        return userinquireservice.BookmarkList(usrInfo);
    }
}
