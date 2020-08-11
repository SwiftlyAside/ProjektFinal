package com.astro.nautica;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/man")
    public String manman() {
        return "man";
    }
}
