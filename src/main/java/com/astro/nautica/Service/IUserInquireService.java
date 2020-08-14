package com.astro.nautica.Service;

import java.util.List;
import java.util.Map;

import com.astro.nautica.VO.InquireVO;

public interface IUserInquireService {
	List<InquireVO> selectInquiresList(Map<String, Object> usrInfo);
	InquireVO getInquire(int inquireId, Map<String, Object> usrInfo);
}
