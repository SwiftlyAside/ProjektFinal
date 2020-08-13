package com.astro.nautica.Service;

import com.astro.nautica.Mapper.MembershipMapper;
import com.astro.nautica.VO.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public boolean login(String id, String pw) {
        if (this.isExistId(id) == 1)
            return pw.contentEquals(membershipMapper.login(id).getPw());
        return false;
    }
}
