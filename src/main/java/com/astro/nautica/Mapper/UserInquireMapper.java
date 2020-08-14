package com.astro.nautica.Mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.astro.nautica.VO.InquireVO;
import com.astro.nautica.VO.ProductReviewVO;
import com.astro.nautica.VO.ProductVO;

//이 서비스의 이름을 변경요청합니다 - MyPageMapper
@Repository
@Mapper
public interface UserInquireMapper {
	// 아이디에 해당하는 문의를 InquireVO의 list형으로 반환
	List<InquireVO> selectUserInquiresList(String userId);
	
	// 아이디에 해당하는 선택된 문의를 InquireVO로 반환
	InquireVO getUserInquire(Map<String, Object> map);
	
	// 아이디별 찜목록을 리스트로 반환
	List<ProductVO> BookmarkList(String userId);
	
	// 아이디별 리뷰리스트를 반환
	List<ProductReviewVO> selectUserReviewList(String UserId);
	
	// 하나의 상세리뷰내용을 반환
	ProductReviewVO getUserReview(Map<String, Object> map);

}