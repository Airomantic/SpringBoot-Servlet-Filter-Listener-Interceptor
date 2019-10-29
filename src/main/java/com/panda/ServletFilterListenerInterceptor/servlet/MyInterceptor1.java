package com.panda.ServletFilterListenerInterceptor.servlet;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: Servlet-Filter-Listener-Interceptor
 * @description:
 * @author: jiangzq
 * @create: 2019-10-29 18:00
 **/
public class MyInterceptor1 implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        System.out.println(">>>MyInterceptor1>>>>>在请求处理之前进行调用（Controller方法调用之前）<<<<<<<<<<");
        return true;//只有返回true才会继续向下执行，返回false取消当前请求
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
        System.out.println(">>>>>>>>MyInterceptor1>>>>>>请求处理之后调用，但是在视图被渲染之前（Controller方法调用之后）<<<<<<<<");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        System.out.println(">>>MyInterceptor1>>>>>在整个结束之后被调用，也就是在DispatchServlet渲染了对应的视图之后执行（主要是用于进行资源清理工作）");
    }
}
