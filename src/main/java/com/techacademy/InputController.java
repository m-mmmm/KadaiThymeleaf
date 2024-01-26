package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
    @Controller
    public class InputController {

    @GetMapping("/input")
    public String getInput(@RequestParam(name = "previous", required = false) String aid, Model model){
        // input.htmlに画面遷移
        model.addAttribute("previous", aid);
        return "input";
    }

}