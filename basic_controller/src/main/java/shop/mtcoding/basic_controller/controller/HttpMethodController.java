package shop.mtcoding.basic_controller.controller;

import org.springframework.stereotype.Controller;

@Controller //컴퍼넌트 스캔(디스패처 서블릿이 찾아준다.)
public class HttpMethodController {
    public HttpMethodController() {
        System.out.println("컴퍼넌트 스캔됨");
    }
}
