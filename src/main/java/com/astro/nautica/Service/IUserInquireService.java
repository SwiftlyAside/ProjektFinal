package com.astro.nautica.Service;

import java.util.List;
import java.util.Map;

import com.astro.nautica.VO.InquireVO;
import com.astro.nautica.VO.ProductReviewVO;
import com.astro.nautica.VO.ProductVO;

//이 서비스의 이름을 변경요청합니다 - IMyPageService
public interface IUserInquireService {

	//문의 내용 리스트
	List<InquireVO> selectInquiresList(Map<String, Object> usrInfo);
	
	//상세 문의
	InquireVO getInquire(int inquireId, Map<String, Object> usrInfo);
	
	//찜목록
	List<ProductVO> BookmarkList(Map<String, Object> usrInfo);
	
	//리뷰 리스트
	List<ProductReviewVO> selectUserReviewList(Map<String, Object> usrInfo);
	
	//상세 리뷰
	ProductReviewVO getUserReview(int reviewId, Map<String, Object> usrInfo);
}
