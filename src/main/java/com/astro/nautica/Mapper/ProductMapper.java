package com.astro.nautica.Mapper;

import com.astro.nautica.VO.ProductVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ProductMapper {
    List<ProductVO> selectTest();
}
