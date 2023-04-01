package ex1.ex1spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data","Hello!");
        return "hello"; //resources/templates의 hello.html를 찾아서 랜더링을 함.찾아가는 역할.

    }
    @GetMapping("ex1-mvc") //MVC-템플릿
    public String ex1Mvc(@RequestParam("nam") String name, Model model){
        model.addAttribute("name", name);
        return "template";
    }

    @GetMapping("ex1-string")
    @ResponseBody
    public String ex1String(@RequestParam("name") String name){
        return "Hello " + name;
    }

    @GetMapping("ex1-API") //API
    @ResponseBody
    public Ex1 ex1API(@RequestParam("name") String name){
        Ex1 ex1 = new Ex1();
        ex1.setName(name);
        return ex1;

    }

    static class Ex1{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
