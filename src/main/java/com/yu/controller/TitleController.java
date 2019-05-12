package com.yu.controller;

import com.yu.domain.Title;
import com.yu.service.TitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.w3c.dom.ls.LSException;

import java.util.List;
import java.util.Map;

/**
 * @author YuGY
 * @date 2019/05/11
 */
@Controller
@RequestMapping("/title")
public class TitleController {
    
    @Autowired
    TitleService titleService;
    
    @GetMapping("/alltitle")
    public String AllTitle(Model model){
        List<Title> titleList = titleService.findAll();
        model.addAttribute("titleList",titleList);
        return "titlelist";
    }
}
