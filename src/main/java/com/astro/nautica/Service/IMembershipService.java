package com.astro.nautica.Service;

import java.util.List;
import java.util.Map;

import com.astro.nautica.VO.ProductVO;

public interface IMembershipService {
	List<ProductVO> BookmarkList(Map<String, Object> usrInfo);
}
