package com.panda.ServletFilterListenerInterceptor.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @program: Servlet-Filter-Listener-Interceptor
 * @description:
 * @author: jiangzq
 * @create: 2019-10-29 16:26
 **/
@WebServlet(urlPatterns = "/myServlet2/*",description = "Servlet的说明")
public class MyServlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(">>>>>>>>doGet()<<<<<<<<<<<");
        doPost(req,resp);//注意这里是doPost()
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(">>>>>>>>doPost()<<<<<<<<<<<<<<");
        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf-8");
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>hello World</title");
        out.println("</head>");
        out.println("</html>");
        out.println("<body>");
        out.println("<h1>这是：MyServlet2</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}
