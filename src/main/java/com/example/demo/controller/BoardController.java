package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {

    @GetMapping("/bmi")
    public String bmiview() {
        System.out.println("bmi에 접근");
        System.out.println("get 방식");
        return "test";
    }

    @PostMapping("/bmi")
    public String boardView(Double height, Double weight, Model model) {
        System.out.println("입력한 키 : " + height);
        System.out.println("입력한 몸무게 : " + weight);

        if (height != null && weight != null) {
            double result = weight / (height * height);
            System.out.println("계산된 bmi : " + result);

            model.addAttribute("res", result);
        } else {
            System.out.println("데이터가 입력되지 않음");
        }

        System.out.println("board에 접근");
        System.out.println("get 방식");

        return "test";
    }
}