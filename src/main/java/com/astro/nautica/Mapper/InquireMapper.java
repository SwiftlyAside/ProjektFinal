package com.astro.nautica.Mapper;

import com.astro.nautica.VO.InquireVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface InquireMapper {
    // 전체 문의를 Inquire VO 리스트로 반환
    List<InquireVO> selectInquiresList();
    
    // 선택된 문의를 Inquire VO 로 반환
    InquireVO getInquire(int inquireId);

    // Inquire Id 를 사용하여 답변 내용을 answer 로 update
    boolean answerInquire(Map<String, Object> map);
}
