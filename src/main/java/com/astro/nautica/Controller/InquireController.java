package com.astro.nautica.Controller;

import com.astro.nautica.Service.InquireService;
import com.astro.nautica.VO.InquireVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("admin")
public class InquireController {

    private final InquireService inquireService;

    @Autowired
    public InquireController(InquireService inquireService) {
        this.inquireService = inquireService;
    }

    @RequestMapping("/showAll")
    public List<InquireVO> showAllList() {
        return inquireService.selectInquiresList();
    }

    @RequestMapping("/detail")
    public InquireVO getDetail(@RequestParam(value = "inquireId", required = false) int inquireId) {
        return inquireService.getInquire(inquireId);
    }

    @RequestMapping("/answer")
    public void answer(@RequestParam("inquireId") int inquireId, @RequestParam("answer") String answer) {
        inquireService.answerInquire(inquireId, answer);
    }
}
