package com.panda.ServletFilterListenerInterceptor.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
//import java.util.logging.Filter;导错了

/**
 * @program: Servlet-Filter-Listener-Interceptor
 * @description:
 * @author: jiangzq
 * @create: 2019-10-29 17:24
 **/
@WebFilter(filterName = "myFilter",urlPatterns = "/*")
public class MyFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("执行过滤操作");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("过滤器销毁");
    }
}
