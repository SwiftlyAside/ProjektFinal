package com.astro.nautica.Service;

import java.util.List;
import java.util.Map;

import com.astro.nautica.VO.InquireVO;
import com.astro.nautica.VO.ProductVO;

public interface IUserInquireService {

    List<ProductVO> BookmarkList(Map<String, Object> usrInfo);

	List<InquireVO> selectInquiresList(Map<String, Object> usrInfo);
	
	InquireVO getInquire(int inquireId, Map<String, Object> usrInfo);
}
