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
import com.astro.nautica.VO.ProductReviewVO;
import com.astro.nautica.VO.ProductVO;

//이 컨트롤러의 이름을 변경요청합니다 - MyPageController
@SessionAttributes("userInfo")
@RestController
@RequestMapping("myPage")
public class UserInquireController {

	private final IUserInquireService userInquireService;
	
	@Autowired
	public UserInquireController(IUserInquireService userInquireService) {
		this.userInquireService = userInquireService;
	}
	
	@ModelAttribute("userInfo")
	public Map<String, Object> userInfo(){
		return new HashMap<String, Object>();
	}
	
	// 해당 아이디가 작성한 문의 내용을 리스트로 반환
	@RequestMapping("inquireInfo")
	public List<InquireVO> orderProduct(@ModelAttribute("userInfo") Map<String, Object> usrInfo){
		return userInquireService.selectInquiresList(usrInfo);
	}
	
	// 해당 아이디가 작성한 하나의 문의 상세내용을 반환
	@RequestMapping("getDetail")
	public InquireVO getDetail(@RequestParam("inquireId") int inquireId, 
				@ModelAttribute("userInfo") Map<String, Object> usrInfo) {
		return userInquireService.getInquire(inquireId, usrInfo);
	}
	
	// 해당 아이디가 찜한 목록을 리스트로 반환
	@RequestMapping("bookmarkInfo")
    public List<ProductVO> bookmarkInfo(@ModelAttribute("userInfo") Map<String, Object> usrInfo) {
        return userInquireService.BookmarkList(usrInfo);
    }
	
	// 해당 아이디가 작성한 리뷰 내용을 리스트로 반환
	@RequestMapping("reviewInfo")
	public List<ProductReviewVO> reviewInfo(@ModelAttribute("userInfo") Map<String, Object> usrInfo){
		return userInquireService.selectUserReviewList(usrInfo);
	}
	
	// 해당 아이디가 작성한 하나의 리뷰 상세내용을 반환
	@RequestMapping("getReviewDetail")
	public ProductReviewVO getReviewDetail(@RequestParam("reviewId") int reviewId, 
			@ModelAttribute("userInfo") Map<String, Object> usrInfo) {
		return userInquireService.getUserReview(reviewId, usrInfo);
	}
	
	
}
