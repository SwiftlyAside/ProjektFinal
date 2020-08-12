package com.astro.nautica;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface IDAO {
    @Select("SELECT * FROM MEMBER WHERE id = #{id}")
    String doSome(@Param("id") String id);
}
