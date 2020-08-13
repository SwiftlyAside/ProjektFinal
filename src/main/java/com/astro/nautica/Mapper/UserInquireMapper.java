package com.astro.nautica.Mapper;

import java.util.List;
import java.util.Map;

import com.astro.nautica.VO.InquireVO;

public interface UserInquireMapper {
	// 아이디에 해당하는 문의를 InquireVO의 list형으로 반환
	List<InquireVO> selectInquiresList(String userId);
	
	// 아이디에 해당하는 선택된 문의를 InquireVO로 반환
	InquireVO getInquire(Map<String, Object> map);
}
