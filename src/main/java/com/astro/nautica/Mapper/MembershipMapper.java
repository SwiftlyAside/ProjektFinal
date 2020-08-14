package com.astro.nautica.Mapper;

import com.astro.nautica.VO.MemberVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.List;

import com.astro.nautica.VO.ProductVO;

@Repository
@Mapper
public interface MembershipMapper {
	List<ProductVO> BookmarkList(String userId);

    // id 존재 확인
    int isExistId(String id);

    // 입력 받은 id로 id pw 가져오기
    MemberVO login(String id);

    // email 로 id 찾기
    String findId(String email);

    // pw 변경하기
    int changePw(Map<String, Object> map);

    // 회원가입
    boolean makeMember(MemberVO memberVO);
}
