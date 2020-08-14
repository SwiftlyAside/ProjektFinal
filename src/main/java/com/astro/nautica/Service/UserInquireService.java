package com.astro.nautica.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.astro.nautica.Mapper.UserInquireMapper;
import com.astro.nautica.VO.InquireVO;
import com.astro.nautica.VO.ProductReviewVO;
import com.astro.nautica.VO.ProductVO;

//이 서비스의 이름을 변경요청합니다 - MyPageService
@Service
public class UserInquireService implements IUserInquireService {

	private final UserInquireMapper userInquireMapper;

	@Autowired
	public UserInquireService(UserInquireMapper userInquireMapper) {
		this.userInquireMapper = userInquireMapper;
	}
	
	@Override
	public List<InquireVO> selectInquiresList(Map<String, Object> usrInfo) {
		return userInquireMapper.selectUserInquiresList(String.valueOf(usrInfo.get("id")));
	}

	@Override
	public InquireVO getInquire(int inquireId, Map<String, Object> usrInfo) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("inquireId", inquireId);
		map.put("userId", String.valueOf(usrInfo.get("id")));
		return userInquireMapper.getUserInquire(map);
	}
	
    @Override
    public List<ProductVO> BookmarkList(Map<String, Object> usrInfo) {
        return userInquireMapper.BookmarkList(String.valueOf(usrInfo.get("id")));
    }
    
	@Override
	public List<ProductReviewVO> selectUserReviewList(Map<String, Object> usrInfo) {
		return userInquireMapper.selectUserReviewList(String.valueOf(usrInfo.get("id")));
	}

	@Override
	public ProductReviewVO getUserReview(int reviewId, Map<String, Object> usrInfo) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("reviewId", reviewId);
		map.put("userId", String.valueOf(usrInfo.get("id")));
		return userInquireMapper.getUserReview(map);
	}

}
