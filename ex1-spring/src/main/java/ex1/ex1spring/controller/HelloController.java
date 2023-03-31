package ex1.ex1spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data","Hello!");
        return "hello"; //resources/templates의 hello.html를 찾아서 랜더링을 함.찾아가는 역할.

    }
}
