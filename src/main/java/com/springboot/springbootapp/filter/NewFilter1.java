package com.springboot.springbootapp.filter;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Component

public class NewFilter1 implements Filter{

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("idk why this is here");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
