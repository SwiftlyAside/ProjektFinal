package com.astro.nautica.Service;

import com.astro.nautica.Mapper.InquireMapper;
import com.astro.nautica.VO.InquireVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class InquireService implements IInquireService {

    private final InquireMapper inquireMapper;

    @Autowired
    public InquireService(InquireMapper inquireMapper) {
        this.inquireMapper = inquireMapper;
    }

    @Override
    public List<InquireVO> selectInquiresList() {
        return inquireMapper.selectInquiresList();
    }

    @Override
    public InquireVO getInquire(int inquireId) {
        return inquireMapper.getInquire(inquireId);
    }

    @Override
    public boolean answerInquire(int inquireId, String answer) {
        Map<String, Object> map = new HashMap<>();
        map.put("inquireId", inquireId);
        map.put("answer", answer);
        return inquireMapper.answerInquire(map);
    }

}
