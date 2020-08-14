package com.astro.nautica.Service;

import com.astro.nautica.Mapper.MembershipMapper;
import com.astro.nautica.VO.MemberVO;
import com.astro.nautica.VO.ProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MembershipService implements IMembershipService {

    private final MembershipMapper membershipMapper;

    @Autowired
    public MembershipService(MembershipMapper membershipMapper) {
        this.membershipMapper = membershipMapper;
    }

    @Override
    public int isExistId(String id) {
        return membershipMapper.isExistId(id);
    }

    @Override
    public boolean login(String id, String pw, @ModelAttribute("userInfo") Map<String, Object> userInfo) {
        if (this.isExistId(id) == 1 && pw.contentEquals(membershipMapper.login(id).getPw())) {
            userInfo.put("id", id);
            return true;
        }
        return false;
    }

    @Override
    public String findId(String email) {
        return membershipMapper.findId(email);
    }

    @Override
    public boolean changePw(String data, String pw, String pwOk) {
        if (pw.contentEquals(pwOk)) {
            Map<String, Object> map = new HashMap<>();
            map.put("data", data);
            map.put("pw", pw);
            membershipMapper.changePw(map);

            return true;
        }
        return false;
    }

    @Override
    public boolean makeMember(MemberVO memberVO) {
        return membershipMapper.makeMember(memberVO);
    }

}
