package com.test.servelt.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class HelloWorld extends HttpServlet {
    public  HelloWorld(){
        super();
        System.out.println("HelloWorld 생성자 호출");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.append("<html>")
                .append("<body>")
                .append("<h1>Hello World</h1><hr>")
                .append("현재 날짜와 시간은 : ")
                .append(String.valueOf(java.time.LocalDateTime.now()))
                .append("</body>")
                .append("</html>");
    }
}
