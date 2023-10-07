package shop.mtcoding.web4.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("*.do")
public class FrontController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("FrontController service()");
        //request는 BR(Buffered Reader)에 접근할 수 있게 한다.
        String httpMethod = req.getMethod(); //request정보가 왔는지 확인해보자.
        System.out.println("method : "+httpMethod);
        //String statusCode = req.getHeader("") //f12 네트워크의 key값을 넣으면 됨
        String action = req.getRequestURI(); //url의 끝부분이 나옴."/hello.do" 이것을 통해 분기할거임
        System.out.println("action + "+action);

        if(action.equals("/board.do")){ //들어온 입력의 분기처리? --> 라우터!!! 즉, 라우팅하는 코드
            //302
            resp.setStatus(302); //ReDirection
            //네이버로 이동시킴 단, 302로 리 다이렉션상태를 만들어줘야함
            //resp.setHeader("Location", "https://www.naver.com");
            resp.setHeader("Location", "board.jsp"); //localhost:8080은 안적어도됨. 내꺼는 디폴트

        }else if(action.equals("/user.do")){

        }else{
            //웹페이지->f12->네트워크창 보면 404로 state code를 바꿀 수 있다. *400번대는 클라이언트 입력 에러
            resp.setStatus(404);
            resp.setHeader("Content-Type", "text/html; charset=utf-8"); //문서 종류를 해더에 등록해야함. 등록안하면 기본은 html
            PrintWriter pw = resp.getWriter(); //버퍼(Buffered Writter)에 접근하게 함. 이제 쓰기만 하면 됨.
            pw.println("<h1>404 NotFound</h1>"); //http body
        }

//        resp.setHeader("Content-Type", "text/plain"); //문서 종류를 해더에 등록해야함. 등록안하면 기본은 html
//        PrintWriter pw = resp.getWriter(); //버퍼에 접근하게 함. 이제 쓰기만 하면 됨.
//        pw.println("<h1>Hello</h1>"); //http body
        // 하지만 자바에 html쓰는건 어려움 그래서 jsp씀

    }
}
