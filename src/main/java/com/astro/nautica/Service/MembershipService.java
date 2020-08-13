package com.astro.nautica.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.astro.nautica.Mapper.MembershipMapper;
import com.astro.nautica.VO.ProductVO;

@Service
public class MembershipService implements IMembershipService{

	private final MembershipMapper membershipMapper;
	
	@Autowired
	public MembershipService(MembershipMapper membershipMapper) {
		this.membershipMapper = membershipMapper;
	}
	@Override
	public List<ProductVO> BookmarkList(Map<String, Object> usrInfo) {
		usrInfo.put("id", "lee123");
		return membershipMapper.BookmarkList(String.valueOf(usrInfo.get("id")));
	}
}
