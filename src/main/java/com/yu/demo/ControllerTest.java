package com.yu.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YuGY
 * @date 2019/05/10
 */
@Controller
public class ControllerTest {
    @ResponseBody
    @RequestMapping("/hello")
    public String  Test(){
        return "Hjjjj";
    }
    
    @GetMapping("/html")
    public String Test2(Model model){
        
        String name = "yu";
        model.addAttribute("name",name);
        return "test";
    }
}
