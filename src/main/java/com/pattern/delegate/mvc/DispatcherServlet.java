package com.pattern.delegate.mvc;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DispatcherServlet extends HttpServlet {

    public void doDispatch(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String uri = request.getRequestURI();
        String mid = request.getParameter("mid");
        if("getMemberById".equals(uri)){
            new MemberController().getMemberId(mid);
        }else if("getOrderById".equals(uri)){
            new OrderController().getOrderById(mid);
        }else if("logout".equals(uri)){
            new SystemController().logout();
        }else {
            response.getWriter().write("404 Not found");
        }
    }

    protected void service(HttpServletRequest request,HttpServletResponse response){
        try {
            doDispatch(request,response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
