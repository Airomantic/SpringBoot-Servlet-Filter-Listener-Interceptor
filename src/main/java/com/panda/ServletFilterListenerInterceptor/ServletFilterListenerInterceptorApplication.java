package com.panda.ServletFilterListenerInterceptor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan       //自动扫描Servlet类
public class ServletFilterListenerInterceptorApplication {
	/*@Bean
	public ServletRegistrationBean MyServlet2() {
		return new ServletRegistrationBean(new MyServlet2(), "/myServlet/*");
	}*/
	//注意urlMappings的url映射路径不要写错斜杠
	public static void main(String[] args) {
		SpringApplication.run(ServletFilterListenerInterceptorApplication.class, args);
	}

}
