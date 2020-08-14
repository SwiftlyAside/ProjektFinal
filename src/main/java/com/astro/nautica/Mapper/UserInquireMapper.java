package com.astro.nautica.Mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.astro.nautica.VO.InquireVO;

@Repository
@Mapper
public interface UserInquireMapper {
	// 아이디에 해당하는 문의를 InquireVO의 list형으로 반환
	List<InquireVO> selectUserInquiresList(String userId);
	
	// 아이디에 해당하는 선택된 문의를 InquireVO로 반환
	InquireVO getUserInquire(Map<String, Object> map);
}