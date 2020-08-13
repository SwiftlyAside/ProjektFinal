package com.astro.nautica.Service;

import com.astro.nautica.VO.InquireVO;

import java.util.List;

public interface IInquireService {
    // 전체 문의를 Inquire VO 리스트로 반환
    List<InquireVO> selectInquiresList();

    // 선택된 문의를 Inquire VO 로 반환
    InquireVO getInquire(int inquireId);

    // 문의에 답변하기
    boolean answerInquire(int inquireId, String answer);
}
