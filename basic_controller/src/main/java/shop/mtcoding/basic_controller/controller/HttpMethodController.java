package shop.mtcoding.basic_controller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller //컴퍼넌트 스캔(디스패처 서블릿이 찾아준다.)
public class HttpMethodController {
    public HttpMethodController() {
        System.out.println("컴퍼넌트 스캔됨");
    }
    @GetMapping("/req/get")
    public void methodGet(){
        System.out.println("methodGet() 호출됨");
    }
    // 디스패처 서블릿이 들고 있는 request와 response를 전달받고 싶을 때
    @GetMapping("/req/get/v2")
    public void methodGetV2(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("methodGetV2() 호출됨");

        PrintWriter pw = response.getWriter();
        pw.println("<h1>Get</h1>"); //Content-Type은 text/html, Status Code는 200
    }

    // Controller에 있는 모든 메서드가 응답(return)하는 문자열은 viewname이다. (그렇게 정한것)
    @GetMapping("/req/get/v3")
    public String methodGetV3() {
        return "hello"; //templates안에 hello.mustache를 찾으러 간다. // 그리고 ViewResolver가 발동됨.
    }
}
