package com.astro.nautica.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.astro.nautica.Mapper.UserInquireMapper;
import com.astro.nautica.VO.InquireVO;

public class UserInquireService implements IUserInquireService {

	private final UserInquireMapper userinquiremapper;
	
	@Autowired
	public UserInquireService(UserInquireMapper userinquiremapper) {
		this.userinquiremapper = userinquiremapper;
	}
	
	@Override
	public List<InquireVO> selectInquiresList(Map<String, Object> usrInfo) {
		return userinquiremapper.selectInquiresList(String.valueOf(usrInfo.get("id")));
	}

	@Override
	public InquireVO getInquire(int inquireId, Map<String, Object> usrInfo) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("inquireId", inquireId);
		map.put("userId", String.valueOf(usrInfo.get("id")));
		return userinquiremapper.getInquire(map);
	}

}
