package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class OutputController {

    @PostMapping("/output")
    public String postOutput(@RequestParam("val") String val, Model model) {
        model.addAttribute("id",val);
        // postOutput.htmlに入力画面から入力値を受け取って、出力画面を表示する
        return "output";
    }
}