package com.astro.nautica.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.astro.nautica.Mapper.UserInquireMapper;
import com.astro.nautica.VO.InquireVO;

@Service
public class UserInquireService implements IUserInquireService {

	private final UserInquireMapper userinquiremapper;
	
	public UserInquireService() {
		this.userinquiremapper = null;
		// TODO Auto-generated constructor stub
	}
	@Autowired
	public UserInquireService(UserInquireMapper userinquiremapper) {
		this.userinquiremapper = userinquiremapper;
	}
	
	@Override
	public List<InquireVO> selectInquiresList(Map<String, Object> usrInfo) {
		//testcode
		usrInfo.put("id", "lee123");
		
		return userinquiremapper.selectUserInquiresList(String.valueOf(usrInfo.get("id")));
	}

	@Override
	public InquireVO getInquire(int inquireId, Map<String, Object> usrInfo) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("inquireId", inquireId);
		map.put("userId", String.valueOf(usrInfo.get("id")));
		return userinquiremapper.getUserInquire(map);
	}

}
