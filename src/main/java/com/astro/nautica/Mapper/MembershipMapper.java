package com.astro.nautica.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.astro.nautica.VO.ProductVO;

@Repository
@Mapper
public interface MembershipMapper {
	List<ProductVO> BookmarkList(String userId);
}
